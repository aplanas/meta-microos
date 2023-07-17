SUMMARY = "KDE Framework for providing different actions given a string query"
DESCRIPTION = "Files needed for developing custom runners or frontends."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "krunner-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "60807ea532101ced63f41dbf261faa0ba67ec92ae73eb2553eda8ffad757752362ba1304b423c2f24ad272cc9a78ff530ff046610fd7c37cb7413e835598c18e"

RPROVIDES:${PN} += "cmake-KF5Runner \
krunner-devel"

RDEPENDS:${PN} += "cmake-KF5Plasma \
cmake-Qt5Core \
extra-cmake-modules \
libKF5Runner5"

inherit rpm
