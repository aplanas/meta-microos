SUMMARY = "A simple GObject game controller library"
DESCRIPTION = "libmanette allows easy access to game controllers."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.6"

RPM_NAME = "libmanette-0_2-0-0.2.6-2.11.aarch64.rpm"
RPM_HASH = "0ab5d41097d0894593b31818479c472d888cc5600f11a16139feae97113e0a20f6a1abc40d9337b5a1f3a8902758c346ea1ea17795e7dbcc43945a40d08ddbb1"

RPROVIDES:${PN} += "libmanette-0-2-0 \
libmanette-0.2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libevdev.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgudev-1.0.so.0"

inherit rpm
