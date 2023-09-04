SUMMARY = "Filesystem detection library"
DESCRIPTION = "Library for filesystem detection."
LICENSE = "LGPL-2.1-or-later"

PV = "2.39.1"

RPM_NAME = "libfdisk1-2.39.1-3.1.aarch64.rpm"
RPM_HASH = "8fd44f4eb03cf16ef47124f467b4dfd6acef8c3ec7a66cec54d59b46c3e8156b77ab06d02171032a7dd781b96469182b043a360b0dc27d3efa7479839ad42566"

RPROVIDES:${PN} += "libfdisk.so.1 \
libfdisk1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libuuid.so.1"

inherit rpm
