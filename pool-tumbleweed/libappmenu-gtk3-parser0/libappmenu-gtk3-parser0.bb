SUMMARY = "GtkMenuShell to GMenuModel parser"
DESCRIPTION = "This library converts GtkMenuShells into GMenuModels."
LICENSE = "LGPL-3.0-or-later"

PV = "0.7.6"

RPM_NAME = "libappmenu-gtk3-parser0-0.7.6-2.1.aarch64.rpm"
RPM_HASH = "356fe3d10b15666bccb28958bd6488cea2f9dc8081db1758d95a98748209fe5aabccb0c74797025854bba65900ae521d2b6d8661f0b54359e627f00b14e603af"

RPROVIDES:${PN} += "libappmenu-gtk3-parser.so.0 \
libappmenu-gtk3-parser0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
