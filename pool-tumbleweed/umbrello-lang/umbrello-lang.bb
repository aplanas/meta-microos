SUMMARY = "Translations for package umbrello"
DESCRIPTION = "Provides translations for the 'umbrello' package."
LICENSE = "GPL-2.0-only & GFDL-1.2-only & GPL-3.0-or-later"

PV = "23.04.3"

RPM_NAME = "umbrello-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "6af54e720cd73835abcf11c8c4a2b90bf53966d7cfef5b8df0dd21db65459b9d5ff55a80cac08e44e9a92180bd1af55f0295755eb145ee524f548f28a5ee5b7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-umbrello-ar \
locale-umbrello-be \
locale-umbrello-bg \
locale-umbrello-br \
locale-umbrello-bs \
locale-umbrello-ca \
locale-umbrello-ca@valencia \
locale-umbrello-cs \
locale-umbrello-cy \
locale-umbrello-da \
locale-umbrello-de \
locale-umbrello-el \
locale-umbrello-en-GB \
locale-umbrello-eo \
locale-umbrello-es \
locale-umbrello-et \
locale-umbrello-eu \
locale-umbrello-fa \
locale-umbrello-fi \
locale-umbrello-fr \
locale-umbrello-ga \
locale-umbrello-gl \
locale-umbrello-hi \
locale-umbrello-hr \
locale-umbrello-hu \
locale-umbrello-ia \
locale-umbrello-it \
locale-umbrello-ja \
locale-umbrello-ka \
locale-umbrello-kk \
locale-umbrello-km \
locale-umbrello-ko \
locale-umbrello-lt \
locale-umbrello-mai \
locale-umbrello-mk \
locale-umbrello-mr \
locale-umbrello-ms \
locale-umbrello-nb \
locale-umbrello-nds \
locale-umbrello-ne \
locale-umbrello-nl \
locale-umbrello-nn \
locale-umbrello-oc \
locale-umbrello-pl \
locale-umbrello-pt \
locale-umbrello-pt-BR \
locale-umbrello-ro \
locale-umbrello-ru \
locale-umbrello-sk \
locale-umbrello-sl \
locale-umbrello-sq \
locale-umbrello-sv \
locale-umbrello-ta \
locale-umbrello-th \
locale-umbrello-tr \
locale-umbrello-ug \
locale-umbrello-uk \
locale-umbrello-zh-CN \
locale-umbrello-zh-TW \
umbrello-lang \
umbrello-lang-all"

RDEPENDS:${PN} += "umbrello"

inherit rpm
