SUMMARY = "Translations for package gdl"
DESCRIPTION = "Provides translations for the 'gdl' package."
LICENSE = "LGPL-2.1-or-later"

PV = "3.40.0"

RPM_NAME = "gdl-lang-3.40.0-2.10.noarch.rpm"
RPM_HASH = "9c84c6e3d70dc95c5dd2324e028353c8480b6b088aecbf4f2d5e502504f00e69f46ce02daa96f1d36abfad611afea88ba9cc9f7ab89df2af1084b75e001af942"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gdl-lang \
gdl-lang-all \
locale-gdl-ar \
locale-gdl-as \
locale-gdl-ast \
locale-gdl-az \
locale-gdl-be \
locale-gdl-bg \
locale-gdl-bn \
locale-gdl-bs \
locale-gdl-ca \
locale-gdl-ca@valencia \
locale-gdl-cs \
locale-gdl-da \
locale-gdl-de \
locale-gdl-dz \
locale-gdl-el \
locale-gdl-en-CA \
locale-gdl-en-GB \
locale-gdl-en@shaw \
locale-gdl-eo \
locale-gdl-es \
locale-gdl-et \
locale-gdl-eu \
locale-gdl-fi \
locale-gdl-fr \
locale-gdl-fur \
locale-gdl-ga \
locale-gdl-gl \
locale-gdl-gu \
locale-gdl-he \
locale-gdl-hi \
locale-gdl-hr \
locale-gdl-hu \
locale-gdl-id \
locale-gdl-it \
locale-gdl-ja \
locale-gdl-km \
locale-gdl-ko \
locale-gdl-lt \
locale-gdl-lv \
locale-gdl-mai \
locale-gdl-mk \
locale-gdl-ml \
locale-gdl-mr \
locale-gdl-nb \
locale-gdl-ne \
locale-gdl-nl \
locale-gdl-oc \
locale-gdl-or \
locale-gdl-pa \
locale-gdl-pl \
locale-gdl-pt \
locale-gdl-pt-BR \
locale-gdl-ro \
locale-gdl-ru \
locale-gdl-si \
locale-gdl-sk \
locale-gdl-sl \
locale-gdl-sq \
locale-gdl-sr \
locale-gdl-sr@latin \
locale-gdl-sv \
locale-gdl-te \
locale-gdl-th \
locale-gdl-tr \
locale-gdl-ug \
locale-gdl-uk \
locale-gdl-vi \
locale-gdl-zh-CN \
locale-gdl-zh-HK \
locale-gdl-zh-TW"

RDEPENDS:${PN} += "gdl"

inherit rpm
