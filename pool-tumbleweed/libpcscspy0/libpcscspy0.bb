SUMMARY = "PC/SC Smart Card Library"
DESCRIPTION = "Supporting library for the PC/SC spy tool."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.0"

RPM_NAME = "libpcscspy0-2.0.0-1.1.aarch64.rpm"
RPM_HASH = "78acad1e68d1f1b512f16dcf656e254d63500d3566d00cf223f6b2850c3fa9124cbce1c43b0ff989c5440ca03ac2f700e3c9f0b100831489a085d957530ba556"

RPROVIDES:${PN} += "libpcscspy.so.0 \
libpcscspy0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
