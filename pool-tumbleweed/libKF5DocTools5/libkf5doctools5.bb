SUMMARY = "Library to create documentation from DocBook"
DESCRIPTION = "Provides tools to generate documentation in various format from DocBook files."
LICENSE = "LGPL-2.1-or-later & MIT"

PV = "5.109.0"

RPM_NAME = "libKF5DocTools5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "24947d9c16b6379d31161be2d8aac5bd0c507247eaf67014333b59d88ce86dc3bec6bc4f09a1dea0c6a813ac7dd84cce623bc19fb1ad27ab83f04cc012bab444"

RPROVIDES:${PN} += "libKF5DocTools.so.5 \
libKF5DocTools5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libQt5Core.so.5 \
libQt5Core5 \
libc.so.6 \
libstdc++.so.6 \
libxml2.so.2 \
libxslt.so.1"

inherit rpm
