SUMMARY = "Translations for package spice-gtk"
DESCRIPTION = "Provides translations for the 'spice-gtk' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.42"

RPM_NAME = "spice-gtk-lang-0.42-1.5.noarch.rpm"
RPM_HASH = "677b142a0b11d55d384faecdd567eb786358ce6c14a584fcb7797dc3ef6c1e9f1dbcdb33b0e332a14d8c274a0b7b164c652f831359797bd9f1130f183e58cab4"
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
