SUMMARY = "Introspection bindings for libdbusmenu-gtk3-4"
DESCRIPTION = "This package contains the GObject Introspection bindings for the GTK+ 3 version \
of the dbusmenu-gtk library."
LICENSE = "GPL-3.0-only & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "16.04.0"

RPM_NAME = "typelib-1_0-DbusmenuGtk3-0_4-16.04.0-9.4.aarch64.rpm"
RPM_HASH = "e8b4fabc31e7313153f216b11e4459a4211b7fd82752ded185341fe44aa1b106c18f9100228768f46bd5b46a81f07ff5bfd90f9db9e47a63867ae69421900398"

RPROVIDES:${PN} += "typelib-1-0-DbusmenuGtk3-0-4 \
typelib-DbusmenuGtk3"

RDEPENDS:${PN} += ""

inherit rpm
