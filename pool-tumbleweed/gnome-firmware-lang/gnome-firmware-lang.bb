SUMMARY = "Translations for package gnome-firmware"
DESCRIPTION = "Provides translations for the 'gnome-firmware' package."
LICENSE = "GPL-2.0-or-later"

PV = "43.1"

RPM_NAME = "gnome-firmware-lang-43.1-1.4.noarch.rpm"
RPM_HASH = "122356508e80fd365c0434b6aad1d32b4c791bc29f20e7d902d629ff2e9fd0849a5383e3f10c9a8e5747991744c579c63fae76b77bfa3764bc7a940189598519"
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
