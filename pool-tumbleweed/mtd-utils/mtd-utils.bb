SUMMARY = "Tools for maintaining Memory Technology Devices"
DESCRIPTION = "This package contains tools for erasing and formatting flash devices, \
including JFFS2, M-Systems DiskOnChip devices, etc."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.2"

RPM_NAME = "mtd-utils-2.1.2-1.14.aarch64.rpm"
RPM_HASH = "8802dddc9df01d72c43f36402df894a7c028efd805a099c7085e505526a8e3426fd29f508636b097a9340951bd39d3bcd4a40a4ee32fe8ab4ee092786c675b86"

RPROVIDES:${PN} += "mtd-utils"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
liblzo2.so.2 \
libuuid.so.1 \
libz.so.1 \
libzstd.so.1"

inherit rpm
