SUMMARY = "Introspection bindings for libdbusmenu-gtk3-4"
DESCRIPTION = "This package contains the GObject Introspection bindings for the GTK+ 3 version \
of the dbusmenu-gtk library."
LICENSE = "GPL-3.0-only & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "16.04.0"

RPM_NAME = "typelib-1_0-DbusmenuGtk3-0_4-16.04.0-9.3.aarch64.rpm"
RPM_HASH = "34e647f7f0c077297a7f14f7bab035c912b21b1d3364cad30bc54028fdd19774c34116357f0236d387d356d54d62a62166d928807ff2cb6aa74856e48899b1d1"

RPROVIDES:${PN} += "typelib(DbusmenuGtk3) \
typelib-1_0-DbusmenuGtk3-0_4 \
typelib-1_0-DbusmenuGtk3-0_4(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
