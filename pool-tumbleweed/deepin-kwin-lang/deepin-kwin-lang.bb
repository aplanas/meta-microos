SUMMARY = "Translations for package deepin-kwin"
DESCRIPTION = "Provides translations for the 'deepin-kwin' package."
LICENSE = "GPL-3.0-or-later"

PV = "5.25.0"

RPM_NAME = "deepin-kwin-lang-5.25.0-1.2.noarch.rpm"
RPM_HASH = "bc2307f1aa8c522f52f44b73c77f943601f2229df72aec769079e769919abdf69b5fa60edd8656856cd3f4860f37385b22a3bb9eef097698c4bf2a5b7550338b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-kwin-lang \
deepin-kwin-lang-all \
locale-deepin-kwin-af \
locale-deepin-kwin-ar \
locale-deepin-kwin-as \
locale-deepin-kwin-ast \
locale-deepin-kwin-az \
locale-deepin-kwin-be \
locale-deepin-kwin-be@latin \
locale-deepin-kwin-bg \
locale-deepin-kwin-bn \
locale-deepin-kwin-bn-IN \
locale-deepin-kwin-br \
locale-deepin-kwin-bs \
locale-deepin-kwin-ca \
locale-deepin-kwin-ca@valencia \
locale-deepin-kwin-cs \
locale-deepin-kwin-cy \
locale-deepin-kwin-da \
locale-deepin-kwin-de \
locale-deepin-kwin-el \
locale-deepin-kwin-en-GB \
locale-deepin-kwin-eo \
locale-deepin-kwin-es \
locale-deepin-kwin-et \
locale-deepin-kwin-eu \
locale-deepin-kwin-fa \
locale-deepin-kwin-fi \
locale-deepin-kwin-fr \
locale-deepin-kwin-ga \
locale-deepin-kwin-gl \
locale-deepin-kwin-gu \
locale-deepin-kwin-he \
locale-deepin-kwin-hi \
locale-deepin-kwin-hr \
locale-deepin-kwin-hu \
locale-deepin-kwin-ia \
locale-deepin-kwin-id \
locale-deepin-kwin-is \
locale-deepin-kwin-it \
locale-deepin-kwin-ja \
locale-deepin-kwin-kk \
locale-deepin-kwin-km \
locale-deepin-kwin-kn \
locale-deepin-kwin-ko \
locale-deepin-kwin-lt \
locale-deepin-kwin-lv \
locale-deepin-kwin-mai \
locale-deepin-kwin-mk \
locale-deepin-kwin-ml \
locale-deepin-kwin-mr \
locale-deepin-kwin-ms \
locale-deepin-kwin-nb \
locale-deepin-kwin-nds \
locale-deepin-kwin-ne \
locale-deepin-kwin-nl \
locale-deepin-kwin-nn \
locale-deepin-kwin-oc \
locale-deepin-kwin-pa \
locale-deepin-kwin-pl \
locale-deepin-kwin-pt \
locale-deepin-kwin-pt-BR \
locale-deepin-kwin-ro \
locale-deepin-kwin-ru \
locale-deepin-kwin-si \
locale-deepin-kwin-sk \
locale-deepin-kwin-sl \
locale-deepin-kwin-sq \
locale-deepin-kwin-sr \
locale-deepin-kwin-sr@ijekavian \
locale-deepin-kwin-sr@ijekavianlatin \
locale-deepin-kwin-sr@latin \
locale-deepin-kwin-sv \
locale-deepin-kwin-ta \
locale-deepin-kwin-te \
locale-deepin-kwin-th \
locale-deepin-kwin-tr \
locale-deepin-kwin-ug \
locale-deepin-kwin-uk \
locale-deepin-kwin-vi \
locale-deepin-kwin-wa \
locale-deepin-kwin-zh-CN \
locale-deepin-kwin-zh-TW"

RDEPENDS:${PN} += "deepin-kwin"

inherit rpm
