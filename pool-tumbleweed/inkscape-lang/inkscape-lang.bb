SUMMARY = "Translations for package inkscape"
DESCRIPTION = "Provides translations for the 'inkscape' package."
LICENSE = "GPL-3.0-only"

PV = "1.3"

RPM_NAME = "inkscape-lang-1.3-1.1.noarch.rpm"
RPM_HASH = "7c2d57ccf052870bc0bcbf171232d6ccee6bda549b9256404572d6d82767c3d9443648e2f3a4791d4594842c265a76e9c4bc35c30208e9e8b80cdcdded25906c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "inkscape-lang \
inkscape-lang-all \
locale-inkscape-ar \
locale-inkscape-as \
locale-inkscape-az \
locale-inkscape-be \
locale-inkscape-bg \
locale-inkscape-bn \
locale-inkscape-br \
locale-inkscape-ca \
locale-inkscape-ca@valencia \
locale-inkscape-cs \
locale-inkscape-da \
locale-inkscape-de \
locale-inkscape-dz \
locale-inkscape-el \
locale-inkscape-en-AU \
locale-inkscape-en-CA \
locale-inkscape-en-GB \
locale-inkscape-eo \
locale-inkscape-es \
locale-inkscape-es-MX \
locale-inkscape-et \
locale-inkscape-eu \
locale-inkscape-fa \
locale-inkscape-fi \
locale-inkscape-fr \
locale-inkscape-ga \
locale-inkscape-gl \
locale-inkscape-gu \
locale-inkscape-he \
locale-inkscape-hi \
locale-inkscape-hr \
locale-inkscape-hu \
locale-inkscape-id \
locale-inkscape-is \
locale-inkscape-it \
locale-inkscape-ja \
locale-inkscape-km \
locale-inkscape-kn \
locale-inkscape-ko \
locale-inkscape-lt \
locale-inkscape-lv \
locale-inkscape-mai \
locale-inkscape-mk \
locale-inkscape-ml \
locale-inkscape-mr \
locale-inkscape-nb \
locale-inkscape-ne \
locale-inkscape-nl \
locale-inkscape-nn \
locale-inkscape-or \
locale-inkscape-pa \
locale-inkscape-pl \
locale-inkscape-pt \
locale-inkscape-pt-BR \
locale-inkscape-ro \
locale-inkscape-ru \
locale-inkscape-sk \
locale-inkscape-sl \
locale-inkscape-sq \
locale-inkscape-sr \
locale-inkscape-sr@latin \
locale-inkscape-sv \
locale-inkscape-ta \
locale-inkscape-te \
locale-inkscape-th \
locale-inkscape-tr \
locale-inkscape-uk \
locale-inkscape-vi \
locale-inkscape-zh-CN \
locale-inkscape-zh-TW"

RDEPENDS:${PN} += "inkscape"

inherit rpm
