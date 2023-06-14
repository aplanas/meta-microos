SUMMARY = "Small library that passes a menu structure across D-Bus"
DESCRIPTION = "This package contains the shared library for the dbusmenu-glib."
LICENSE = "GPL-3.0-only & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "16.04.0"

RPM_NAME = "libdbusmenu-glib4-16.04.0-9.3.aarch64.rpm"
RPM_HASH = "3f2485b5f49c5a2b9313e3aa1ac04a3c451233a1c063684b7ad8cdadc6ca0006eda2e59538d4e2f340338c79c46332d24e357d44e5c42b64bca3bf7f1b541708"

RPROVIDES:${PN} += "libdbusmenu-glib.so.4 \
libdbusmenu-glib4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
