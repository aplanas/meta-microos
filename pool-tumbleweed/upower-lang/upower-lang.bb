SUMMARY = "Translations for package upower"
DESCRIPTION = "Provides translations for the 'upower' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.90.2"

RPM_NAME = "upower-lang-1.90.2-1.1.noarch.rpm"
RPM_HASH = "49f15f3fff6e92dc4e4c525fd38596e0e282a0f09412c2e89d213e43deac1dd53f3e29583cc9aba55f1c2f8a7a388160c5c2aac727f6f4f854c67346aa75cac8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-upower-fr \
locale-upower-it \
locale-upower-pl \
locale-upower-sv \
upower-lang \
upower-lang-all"

RDEPENDS:${PN} += "upower"

inherit rpm
