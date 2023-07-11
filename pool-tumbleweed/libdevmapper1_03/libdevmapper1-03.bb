SUMMARY = "Library for device-mapper"
DESCRIPTION = "Device mapper main shared library"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.03.16_1.02.185"

RPM_NAME = "libdevmapper1_03-2.03.16_1.02.185-7.1.aarch64.rpm"
RPM_HASH = "02b47397413b4fa1525e9229d36c0063f25386769198bed8285e0db8a5955a951ec38650a471455fd81381de6c460a648b96a52d29d8d235ef76b780aba6f40c"

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
