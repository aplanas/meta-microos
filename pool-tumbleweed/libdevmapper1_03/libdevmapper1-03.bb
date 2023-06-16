SUMMARY = "Library for device-mapper"
DESCRIPTION = "Device mapper main shared library"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.03.16_1.02.185"

RPM_NAME = "libdevmapper1_03-2.03.16_1.02.185-6.3.aarch64.rpm"
RPM_HASH = "6f23ec53d799416cbaf73dabcbede8ea4a15b714082be36ab6b33eb94c60ddf8809f52be064a48d6e9cec65b24239782c461a6718ba8a65f6cfb450ada60f367"

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
