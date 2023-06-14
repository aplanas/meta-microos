SUMMARY = "Supporting package for the additional plugins for Kdevelop5"
DESCRIPTION = "Supporting package for the additional plugins for Kdevelop5 Integrated Development Environment"
LICENSE = "LGPL-2.0-or-later & GPL-2.0-or-later"

PV = "2.2.2"

RPM_NAME = "kdevelop5-pg-qt-2.2.2-1.3.aarch64.rpm"
RPM_HASH = "37b1d972182e36c1bb839d08f0084e3ea150e2854959aed6388e5a823c811e76403729d802756a74bb02933018a80972069d2e23b28ff26efa8c8d3d1192cca6"

RPROVIDES:${PN} += "cmake-KDevelop-PG-Qt \
kdevelop5-pg-qt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
