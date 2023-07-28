SUMMARY = "Translations for package cheese"
DESCRIPTION = "Provides translations for the 'cheese' package."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "cheese-lang-44.1-1.1.noarch.rpm"
RPM_HASH = "e694ee0d2303412036ec373534431d9430b276a37e06817f940cd91a7b202bca2dfec0852927b8fe4afbd5490d4e6c35de1acf79a97a22bac53fab7e11ab86cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cheese-lang \
cheese-lang-all \
locale-cheese-af \
locale-cheese-ar \
locale-cheese-as \
locale-cheese-ast \
locale-cheese-be \
locale-cheese-be@latin \
locale-cheese-bg \
locale-cheese-bn \
locale-cheese-bn-IN \
locale-cheese-bs \
locale-cheese-ca \
locale-cheese-ca@valencia \
locale-cheese-cs \
locale-cheese-da \
locale-cheese-de \
locale-cheese-dz \
locale-cheese-el \
locale-cheese-en-GB \
locale-cheese-en@shaw \
locale-cheese-eo \
locale-cheese-es \
locale-cheese-et \
locale-cheese-eu \
locale-cheese-fa \
locale-cheese-fi \
locale-cheese-fr \
locale-cheese-fur \
locale-cheese-ga \
locale-cheese-gl \
locale-cheese-gu \
locale-cheese-he \
locale-cheese-hi \
locale-cheese-hr \
locale-cheese-hu \
locale-cheese-id \
locale-cheese-is \
locale-cheese-it \
locale-cheese-ja \
locale-cheese-ka \
locale-cheese-kk \
locale-cheese-km \
locale-cheese-kn \
locale-cheese-ko \
locale-cheese-lt \
locale-cheese-lv \
locale-cheese-mai \
locale-cheese-mk \
locale-cheese-ml \
locale-cheese-mr \
locale-cheese-ms \
locale-cheese-nb \
locale-cheese-nds \
locale-cheese-ne \
locale-cheese-nl \
locale-cheese-nn \
locale-cheese-oc \
locale-cheese-or \
locale-cheese-pa \
locale-cheese-pl \
locale-cheese-pt \
locale-cheese-pt-BR \
locale-cheese-ro \
locale-cheese-ru \
locale-cheese-sk \
locale-cheese-sl \
locale-cheese-sq \
locale-cheese-sr \
locale-cheese-sr@latin \
locale-cheese-sv \
locale-cheese-ta \
locale-cheese-te \
locale-cheese-th \
locale-cheese-tr \
locale-cheese-ug \
locale-cheese-uk \
locale-cheese-vi \
locale-cheese-zh-CN \
locale-cheese-zh-HK \
locale-cheese-zh-TW"

RDEPENDS:${PN} += "cheese"

inherit rpm
