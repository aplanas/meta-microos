SUMMARY = "Command line utilities for ZBC/ZAC disk manipulation"
DESCRIPTION = "libzbc is a simple library providing functions for manipulating Zoned \
Block Command (ZBC), Zoned-device ATA command set (ZAC) disks."
LICENSE = "BSD-2-Clause & LGPL-3.0-or-later"

PV = "5.13.0"

RPM_NAME = "libzbc-tools-5.13.0-1.3.aarch64.rpm"
RPM_HASH = "c1be376898e7f04809e6298f09c19189c285c6178a2c8bc8cad512cda0861d9e95e23012f381986306087c70fbfac551fc62637791e84d763ce6af3210ffe2d3"

RPROVIDES:${PN} += "libzbc-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzbc.so.5"

inherit rpm
