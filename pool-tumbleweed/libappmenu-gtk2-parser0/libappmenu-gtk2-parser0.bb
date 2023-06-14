SUMMARY = "Gtk2MenuShell to GMenuModel parser"
DESCRIPTION = "This library converts Gtk3MenuShells into GMenuModels."
LICENSE = "LGPL-3.0-or-later"

PV = "0.7.6"

RPM_NAME = "libappmenu-gtk2-parser0-0.7.6-1.6.aarch64.rpm"
RPM_HASH = "49d6460150890b1846dde04a47c11b1fe7ba0dfa5e9a8fa665342ea06df6d10d88fc20ac6342c6cf79d962ee6e089ec566fe2d44b3215ab2e238279ee47394f7"

RPROVIDES:${PN} += "libappmenu-gtk2-parser.so.0 \
libappmenu-gtk2-parser0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
