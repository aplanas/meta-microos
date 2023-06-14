SUMMARY = "Translations for package gnome-firmware"
DESCRIPTION = "Provides translations for the 'gnome-firmware' package."
LICENSE = "GPL-2.0-or-later"

PV = "43.1"

RPM_NAME = "gnome-firmware-lang-43.1-1.3.noarch.rpm"
RPM_HASH = "125a6d7daa9af0e30faf3876e472a51b2e22a3efc8550841534d89fb67972a7f56a1ab59f4ba65fbd15412893bbde705ebdb626d6d261eb4e5c69c9ce3fa5051"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-firmware-lang \
gnome-firmware-lang-all \
locale-gnome-firmware-ca \
locale-gnome-firmware-cs \
locale-gnome-firmware-da \
locale-gnome-firmware-de \
locale-gnome-firmware-en-GB \
locale-gnome-firmware-es \
locale-gnome-firmware-eu \
locale-gnome-firmware-fi \
locale-gnome-firmware-fr-FR \
locale-gnome-firmware-hr \
locale-gnome-firmware-id \
locale-gnome-firmware-it \
locale-gnome-firmware-ka \
locale-gnome-firmware-nl \
locale-gnome-firmware-pa \
locale-gnome-firmware-pl \
locale-gnome-firmware-pt-BR \
locale-gnome-firmware-ru \
locale-gnome-firmware-sk \
locale-gnome-firmware-sl \
locale-gnome-firmware-sr \
locale-gnome-firmware-sv \
locale-gnome-firmware-tr \
locale-gnome-firmware-uk \
locale-gnome-firmware-zh-CN"

RDEPENDS:${PN} += "gnome-firmware"

inherit rpm
