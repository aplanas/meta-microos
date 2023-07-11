SUMMARY = "Development files for the Qt 6 Test library"
DESCRIPTION = "Development files for the Qt 6 Test library."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-test-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "e09e8b5d6f70f17f1ef7c17dfe58bc8c16c2eb8aad659e3964377c985fc0db1c5bdcbdb56ec0aa0f41c4a568068ec8ba869d8a69ff0730d5050cc31c4b9a0204"

RPROVIDES:${PN} += "cmake-Qt6Test \
pkgconfig-Qt6Test \
qt6-test-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
libQt6Test6 \
pkgconfig-Qt6Core"

inherit rpm
