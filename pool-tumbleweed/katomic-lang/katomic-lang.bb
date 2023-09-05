SUMMARY = "Translations for package katomic"
DESCRIPTION = "Provides translations for the 'katomic' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "katomic-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "b1bd62b52dfda3d33e72dd787908cb3a311e214acb47228dfe39b76eb7840d3e1c66566fedbf86299960df40c212b6974d6dfd97e917b2ccfe39eb882335c6ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "katomic-lang \
katomic-lang-all \
locale-katomic-af \
locale-katomic-ar \
locale-katomic-be \
locale-katomic-bg \
locale-katomic-bn \
locale-katomic-br \
locale-katomic-bs \
locale-katomic-ca \
locale-katomic-ca@valencia \
locale-katomic-cs \
locale-katomic-cy \
locale-katomic-da \
locale-katomic-de \
locale-katomic-el \
locale-katomic-en-GB \
locale-katomic-eo \
locale-katomic-es \
locale-katomic-et \
locale-katomic-eu \
locale-katomic-fa \
locale-katomic-fi \
locale-katomic-fr \
locale-katomic-ga \
locale-katomic-gl \
locale-katomic-he \
locale-katomic-hi \
locale-katomic-hr \
locale-katomic-hu \
locale-katomic-id \
locale-katomic-is \
locale-katomic-it \
locale-katomic-ja \
locale-katomic-ka \
locale-katomic-kk \
locale-katomic-km \
locale-katomic-ko \
locale-katomic-lt \
locale-katomic-lv \
locale-katomic-mai \
locale-katomic-mk \
locale-katomic-ml \
locale-katomic-mr \
locale-katomic-ms \
locale-katomic-nb \
locale-katomic-nds \
locale-katomic-ne \
locale-katomic-nl \
locale-katomic-nn \
locale-katomic-oc \
locale-katomic-pa \
locale-katomic-pl \
locale-katomic-pt \
locale-katomic-pt-BR \
locale-katomic-ro \
locale-katomic-ru \
locale-katomic-sk \
locale-katomic-sl \
locale-katomic-sq \
locale-katomic-sr \
locale-katomic-sr@ijekavian \
locale-katomic-sr@ijekavianlatin \
locale-katomic-sr@latin \
locale-katomic-sv \
locale-katomic-ta \
locale-katomic-te \
locale-katomic-th \
locale-katomic-tr \
locale-katomic-ug \
locale-katomic-uk \
locale-katomic-vi \
locale-katomic-zh-CN \
locale-katomic-zh-TW"

RDEPENDS:${PN} += "katomic"

inherit rpm
