SUMMARY = "Filesystem detection library"
DESCRIPTION = "Library for filesystem detection."
LICENSE = "LGPL-2.1-or-later"

PV = "2.38.1"

RPM_NAME = "libfdisk1-2.38.1-13.1.aarch64.rpm"
RPM_HASH = "01edb22b5d2b7b1444cfb93c130dc184acfbece4602752368aa46e3d834cd81d62b10677c529ed31422313f5b5f728453a3ddf9b81566b1b233f954bbff5fade"

RPROVIDES:${PN} += "libfdisk.so.1 \
libfdisk1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libuuid.so.1"

inherit rpm
