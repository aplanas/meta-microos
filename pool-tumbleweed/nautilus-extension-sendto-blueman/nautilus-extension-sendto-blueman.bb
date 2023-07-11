SUMMARY = "A sendto integration for Nautilus"
DESCRIPTION = "This package add sendto integration for Nautilus."
LICENSE = "GPL-3.0-only"

PV = "2.3.5"

RPM_NAME = "nautilus-extension-sendto-blueman-2.3.5-1.4.noarch.rpm"
RPM_HASH = "075661fa7b2cecfc0d52c564ca3967a2b104ff0c0715b1797bbbfa71f42dce777029cd648d7815fe1f3f213e3fd53f1cad7ea213dba844e6c49214c23b82120c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nautilus-extension-sendto-blueman"

RDEPENDS:${PN} += "blueman \
typelib-GObject \
typelib-Gio \
typelib-Nautilus"

inherit rpm
