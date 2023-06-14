SUMMARY = "Translations for package kross"
DESCRIPTION = "Provides translations for the 'kross' package."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kross-lang-5.106.0-1.1.noarch.rpm"
RPM_HASH = "72d477e7cee533d90bccf1d7afa4999b33586dfdc13f041f8daad64e9d5bd69099d9c6e8394aae7ea94da4a9361cf13761c23e8f1678f0866a3b3c497a39f1bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kross-lang \
kross-lang-all \
locale-kross-af \
locale-kross-ar \
locale-kross-as \
locale-kross-az \
locale-kross-be \
locale-kross-be@latin \
locale-kross-bg \
locale-kross-bn \
locale-kross-bn-IN \
locale-kross-br \
locale-kross-bs \
locale-kross-ca \
locale-kross-ca@valencia \
locale-kross-cs \
locale-kross-cy \
locale-kross-da \
locale-kross-de \
locale-kross-el \
locale-kross-en-GB \
locale-kross-eo \
locale-kross-es \
locale-kross-et \
locale-kross-eu \
locale-kross-fa \
locale-kross-fi \
locale-kross-fr \
locale-kross-ga \
locale-kross-gd \
locale-kross-gl \
locale-kross-gu \
locale-kross-he \
locale-kross-hi \
locale-kross-hr \
locale-kross-hu \
locale-kross-ia \
locale-kross-id \
locale-kross-is \
locale-kross-it \
locale-kross-ja \
locale-kross-ka \
locale-kross-kk \
locale-kross-km \
locale-kross-kn \
locale-kross-ko \
locale-kross-lt \
locale-kross-lv \
locale-kross-mai \
locale-kross-mk \
locale-kross-ml \
locale-kross-mr \
locale-kross-ms \
locale-kross-nb \
locale-kross-nds \
locale-kross-ne \
locale-kross-nl \
locale-kross-nn \
locale-kross-oc \
locale-kross-or \
locale-kross-pa \
locale-kross-pl \
locale-kross-pt \
locale-kross-pt-BR \
locale-kross-ro \
locale-kross-ru \
locale-kross-si \
locale-kross-sk \
locale-kross-sl \
locale-kross-sq \
locale-kross-sr \
locale-kross-sr@ijekavian \
locale-kross-sr@ijekavianlatin \
locale-kross-sr@latin \
locale-kross-sv \
locale-kross-ta \
locale-kross-te \
locale-kross-th \
locale-kross-tr \
locale-kross-ug \
locale-kross-uk \
locale-kross-vi \
locale-kross-wa \
locale-kross-zh-CN \
locale-kross-zh-HK \
locale-kross-zh-TW"

RDEPENDS:${PN} += "kross"

inherit rpm
