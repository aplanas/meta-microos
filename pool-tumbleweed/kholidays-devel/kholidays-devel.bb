SUMMARY = "Development files for the KDE PIM Holiday API"
DESCRIPTION = "This package contains necessary include files and libraries needed \
to develop applications depending on the kholidays library"
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kholidays-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "ecd82fa87e0a449eee9f69689d3a07e94ff08d9777aef272414c20dabee0d55a6096825b2f3e1f99d0068f048eeb16b4bc21ae6dba1f4192b8983649f61f8b6a"

RPROVIDES:${PN} += "cmake-KF5Holidays \
kholidays-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
libKF5Holidays5"

inherit rpm
