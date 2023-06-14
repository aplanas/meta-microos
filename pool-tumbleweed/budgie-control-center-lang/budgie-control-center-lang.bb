SUMMARY = "Translations for package budgie-control-center"
DESCRIPTION = "Provides translations for the 'budgie-control-center' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.0+0"

RPM_NAME = "budgie-control-center-lang-1.2.0+0-1.3.noarch.rpm"
RPM_HASH = "3ff3689fd6c261031c2d52c5ad27a3ccb80ca66d079eb8a089943f4c1ba2fb6f97048774c2eae208e335d771251fb5660100f20b46f9657a475139f6de242bc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "budgie-control-center-lang \
budgie-control-center-lang-all \
locale-budgie-control-center-af \
locale-budgie-control-center-ar \
locale-budgie-control-center-as \
locale-budgie-control-center-ast \
locale-budgie-control-center-be \
locale-budgie-control-center-bg \
locale-budgie-control-center-bn \
locale-budgie-control-center-bn-IN \
locale-budgie-control-center-bs \
locale-budgie-control-center-ca \
locale-budgie-control-center-ca@valencia \
locale-budgie-control-center-cs \
locale-budgie-control-center-cy \
locale-budgie-control-center-da \
locale-budgie-control-center-de \
locale-budgie-control-center-el \
locale-budgie-control-center-en-GB \
locale-budgie-control-center-en-US \
locale-budgie-control-center-eo \
locale-budgie-control-center-es \
locale-budgie-control-center-et \
locale-budgie-control-center-eu \
locale-budgie-control-center-fa \
locale-budgie-control-center-fi \
locale-budgie-control-center-fr \
locale-budgie-control-center-fur \
locale-budgie-control-center-gd \
locale-budgie-control-center-gl \
locale-budgie-control-center-gu \
locale-budgie-control-center-he \
locale-budgie-control-center-hi \
locale-budgie-control-center-hr \
locale-budgie-control-center-hu \
locale-budgie-control-center-id \
locale-budgie-control-center-is \
locale-budgie-control-center-it \
locale-budgie-control-center-ja \
locale-budgie-control-center-ka \
locale-budgie-control-center-kk \
locale-budgie-control-center-kn \
locale-budgie-control-center-ko \
locale-budgie-control-center-lt \
locale-budgie-control-center-lv \
locale-budgie-control-center-mai \
locale-budgie-control-center-mk \
locale-budgie-control-center-ml \
locale-budgie-control-center-mr \
locale-budgie-control-center-ms \
locale-budgie-control-center-nb \
locale-budgie-control-center-nds \
locale-budgie-control-center-ne \
locale-budgie-control-center-nl \
locale-budgie-control-center-nn \
locale-budgie-control-center-oc \
locale-budgie-control-center-or \
locale-budgie-control-center-pa \
locale-budgie-control-center-pl \
locale-budgie-control-center-pt \
locale-budgie-control-center-pt-BR \
locale-budgie-control-center-pt-PT \
locale-budgie-control-center-ro \
locale-budgie-control-center-ru \
locale-budgie-control-center-si \
locale-budgie-control-center-sk \
locale-budgie-control-center-sl \
locale-budgie-control-center-sq \
locale-budgie-control-center-sr \
locale-budgie-control-center-sr@latin \
locale-budgie-control-center-sv \
locale-budgie-control-center-ta \
locale-budgie-control-center-te \
locale-budgie-control-center-th \
locale-budgie-control-center-tr \
locale-budgie-control-center-uk \
locale-budgie-control-center-vi \
locale-budgie-control-center-zh-CN \
locale-budgie-control-center-zh-HK \
locale-budgie-control-center-zh-TW"

RDEPENDS:${PN} += "budgie-control-center"

inherit rpm
