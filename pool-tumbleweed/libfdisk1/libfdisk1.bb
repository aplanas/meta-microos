SUMMARY = "Filesystem detection library"
DESCRIPTION = "Library for filesystem detection."
LICENSE = "LGPL-2.1-or-later"

PV = "2.39.1"

RPM_NAME = "libfdisk1-2.39.1-1.1.aarch64.rpm"
RPM_HASH = "384c105ebab8fd943165c79612f85fb463773b6714d5a539a9a4ee117a0b03aa7246176f7c3332e8d2fbba680aeec80a7519f0be18bc5f32bebdbb9daea4876b"

RPROVIDES:${PN} += "libfdisk.so.1 \
libfdisk1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libuuid.so.1"

inherit rpm
