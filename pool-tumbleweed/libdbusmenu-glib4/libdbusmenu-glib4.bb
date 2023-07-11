SUMMARY = "Small library that passes a menu structure across D-Bus"
DESCRIPTION = "This package contains the shared library for the dbusmenu-glib."
LICENSE = "GPL-3.0-only & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "16.04.0"

RPM_NAME = "libdbusmenu-glib4-16.04.0-9.4.aarch64.rpm"
RPM_HASH = "70d8863e371a61cf19aec94d8d62d1fef26cad8ebf5491b0fb1ea5421d181cf715d9297f39773a09fc6b02769f6daf0a6e33233c5e2c30b68d0eaa9c50377f02"

RPROVIDES:${PN} += "libdbusmenu-glib.so.4 \
libdbusmenu-glib4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
