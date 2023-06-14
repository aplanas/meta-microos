SUMMARY = "Translations for package marco"
DESCRIPTION = "Provides translations for the 'marco' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.2"

RPM_NAME = "marco-lang-1.26.2-1.1.noarch.rpm"
RPM_HASH = "635d846db8de8a2f31b1fe265974d78605f288d33465f02f80ba1081c3a93f277dc3b6e88ebf54d5ade0ebb9de28ca3bf788fff868adb1f6d97ef21ff15c22d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-marco-af \
locale-marco-ar \
locale-marco-as \
locale-marco-ast \
locale-marco-az \
locale-marco-be \
locale-marco-bg \
locale-marco-bn \
locale-marco-bn-IN \
locale-marco-br \
locale-marco-bs \
locale-marco-ca \
locale-marco-ca@valencia \
locale-marco-cs \
locale-marco-cy \
locale-marco-da \
locale-marco-de \
locale-marco-dz \
locale-marco-el \
locale-marco-en-AU \
locale-marco-en-CA \
locale-marco-en-GB \
locale-marco-eo \
locale-marco-es \
locale-marco-es-AR \
locale-marco-es-CO \
locale-marco-es-MX \
locale-marco-es-PR \
locale-marco-et \
locale-marco-eu \
locale-marco-fa \
locale-marco-fi \
locale-marco-fr \
locale-marco-fur \
locale-marco-ga \
locale-marco-gl \
locale-marco-gu \
locale-marco-he \
locale-marco-hi \
locale-marco-hr \
locale-marco-hu \
locale-marco-id \
locale-marco-is \
locale-marco-it \
locale-marco-ja \
locale-marco-ka \
locale-marco-kk \
locale-marco-kn \
locale-marco-ko \
locale-marco-lt \
locale-marco-lv \
locale-marco-mai \
locale-marco-mk \
locale-marco-ml \
locale-marco-mr \
locale-marco-ms \
locale-marco-nb \
locale-marco-nds \
locale-marco-ne \
locale-marco-nl \
locale-marco-nn \
locale-marco-oc \
locale-marco-or \
locale-marco-pa \
locale-marco-pl \
locale-marco-pt \
locale-marco-pt-BR \
locale-marco-ro \
locale-marco-ru \
locale-marco-si \
locale-marco-sk \
locale-marco-sl \
locale-marco-sq \
locale-marco-sr \
locale-marco-sr@latin \
locale-marco-sv \
locale-marco-ta \
locale-marco-te \
locale-marco-th \
locale-marco-tr \
locale-marco-ug \
locale-marco-uk \
locale-marco-vi \
locale-marco-wa \
locale-marco-zh-CN \
locale-marco-zh-HK \
locale-marco-zh-TW \
marco-lang \
marco-lang-all"

RDEPENDS:${PN} += "marco"

inherit rpm
