SUMMARY = "GtkMenuShell to GMenuModel parser"
DESCRIPTION = "This library converts GtkMenuShells into GMenuModels."
LICENSE = "LGPL-3.0-or-later"

PV = "0.7.6"

RPM_NAME = "libappmenu-gtk3-parser0-0.7.6-1.6.aarch64.rpm"
RPM_HASH = "596979fd3983ab314f77492510f9db80d26168947e45ce0afddba5436fa13b7362961649f4ed44cf7a826d642212d4cdfec1bcfe07c6f12c8edc5dea14977b35"

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
