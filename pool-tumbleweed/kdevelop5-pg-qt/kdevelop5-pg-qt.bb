SUMMARY = "Supporting package for the additional plugins for Kdevelop5"
DESCRIPTION = "Supporting package for the additional plugins for Kdevelop5 Integrated Development Environment"
LICENSE = "LGPL-2.0-or-later & GPL-2.0-or-later"

PV = "2.2.2"

RPM_NAME = "kdevelop5-pg-qt-2.2.2-1.4.aarch64.rpm"
RPM_HASH = "ff1c77f1741ce69c7978b302c5aae2f6ae9f5014d320a2c51e7b9a6eff9ff982dbaa50b620a06328fc1b254669aa6f0c9b3c582ed5d8a0ed045567f6f3ec44f4"

RPROVIDES:${PN} += "cmake-KDevelop-PG-Qt \
kdevelop5-pg-qt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
