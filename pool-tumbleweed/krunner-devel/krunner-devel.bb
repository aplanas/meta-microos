SUMMARY = "KDE Framework for providing different actions given a string query"
DESCRIPTION = "Files needed for developing custom runners or frontends."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "krunner-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "63bdb5859632c7cea9662f9cf5343a93bf122486768ea5c51e69099b5aee59b8112d45a05109af23f3b6492cebb9375e7c309e1d57d2618aef377e81e9d2c865"

RPROVIDES:${PN} += "cmake-KF5Runner \
krunner-devel"

RDEPENDS:${PN} += "cmake-KF5Plasma \
cmake-Qt5Core \
extra-cmake-modules \
libKF5Runner5"

inherit rpm
