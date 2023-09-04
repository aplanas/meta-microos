SUMMARY = "Library for device-mapper"
DESCRIPTION = "Device mapper main shared library"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.03.16_1.02.185"

RPM_NAME = "libdevmapper1_03-2.03.16_1.02.185-8.1.aarch64.rpm"
RPM_HASH = "5c4b3431879c05a560a6955b58f02dd9254709b71baefe43362da3159e145011fc866fcf63d235e4b67d8e349f7bc199b314a31a8a872e9b675877fb2341c5d0"

RPROVIDES:${PN} += "libdevmapper.so.1.03 \
libdevmapper1-03"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libselinux.so.1 \
libudev.so.1"

inherit rpm
