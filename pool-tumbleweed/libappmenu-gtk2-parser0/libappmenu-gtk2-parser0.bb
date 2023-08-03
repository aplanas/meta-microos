SUMMARY = "Gtk2MenuShell to GMenuModel parser"
DESCRIPTION = "This library converts Gtk3MenuShells into GMenuModels."
LICENSE = "LGPL-3.0-or-later"

PV = "0.7.6"

RPM_NAME = "libappmenu-gtk2-parser0-0.7.6-2.1.aarch64.rpm"
RPM_HASH = "ab776472c6fed9b7d213452163506f05385f1e43df75c306575a3a3b61c33ab1fca0e3f7e38915176cbb6cb27e4a0eaad252c2f49b30414836714993bfffcb5f"

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
