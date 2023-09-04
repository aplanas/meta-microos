SUMMARY = "Translations for package dcraw"
DESCRIPTION = "Provides translations for the 'dcraw' package."
LICENSE = "GPL-2.0-or-later"

PV = "9.28.0"

RPM_NAME = "dcraw-lang-9.28.0-3.1.noarch.rpm"
RPM_HASH = "0f29b6121e0fbb604ca75fe625307fb39cab92fa7feb3ce4c56dfa4843feea81981b998a9ee280ea58a7a1bce6bc039059e72353986e95194e1f1a09a1c6b473"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dcraw-lang \
dcraw-lang-all \
locale-dcraw-ca \
locale-dcraw-cs \
locale-dcraw-da \
locale-dcraw-de \
locale-dcraw-eo \
locale-dcraw-es \
locale-dcraw-fr \
locale-dcraw-hu \
locale-dcraw-it \
locale-dcraw-ja \
locale-dcraw-nl \
locale-dcraw-pl \
locale-dcraw-pt \
locale-dcraw-ro \
locale-dcraw-ru \
locale-dcraw-sv \
locale-dcraw-zh-CN \
locale-dcraw-zh-TW"

RDEPENDS:${PN} += "dcraw"

inherit rpm
