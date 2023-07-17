SUMMARY = "Translations for package spice-gtk"
DESCRIPTION = "Provides translations for the 'spice-gtk' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.42"

RPM_NAME = "spice-gtk-lang-0.42-2.1.noarch.rpm"
RPM_HASH = "7ff85ba9ec8a5eed3a004ef7390e2177645aa0d33baf6fd4924bc4cafaad7dc734e1939adcdbbf5f6b2c764f3ad1450246942f5075e91a65f6014390c74a0e54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-spice-gtk-cs \
locale-spice-gtk-de \
locale-spice-gtk-fr \
locale-spice-gtk-it \
locale-spice-gtk-ka \
locale-spice-gtk-ru \
spice-gtk-lang \
spice-gtk-lang-all"

RDEPENDS:${PN} += "spice-gtk"

inherit rpm
