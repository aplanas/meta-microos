SUMMARY = "Linux kernel trace file system library"
DESCRIPTION = "This library provides C APIs to access the kernel trace file system."
LICENSE = "LGPL-2.1-only"

PV = "1.7.0"

RPM_NAME = "libtracefs1-1.7.0-1.1.aarch64.rpm"
RPM_HASH = "d5b0b2b07067be3ed36cbaac8b5f339e27fee1a5b08e5c99c718f9d3685799dc23d9d1c13eb78b9d6f95ae023472365123d5411e31e234664e02d7a0b8abdc6f"

RPROVIDES:${PN} += "libtracefs.so.1 \
libtracefs1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtraceevent.so.1"

inherit rpm
