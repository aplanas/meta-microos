SUMMARY = "Shared library files for libpanel"
DESCRIPTION = "The libpanel1-1 package contains shared libraries libpanel."
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.0"

RPM_NAME = "libpanel1-1-1.2.0-1.2.aarch64.rpm"
RPM_HASH = "d07970d5ee89d9373cb829a571b5e52a99542ff94d522512c3ac1ff10035926ea97f0fd387d0672b88896a39e120ff4a055e10efb5fab9b274f97f02057a5b7c"

RPROVIDES:${PN} += "libpanel \
libpanel-1.so.1 \
libpanel1-1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libcairo.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgtk-4.so.1"

inherit rpm
