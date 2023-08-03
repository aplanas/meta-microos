SUMMARY = "Development files for the Qt 6 Test library"
DESCRIPTION = "Development files for the Qt 6 Test library."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-test-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "86be818c702edc1a55b42f98e446493694a9e52886a38962efd899ee9865e336da1f49ed3239e8b4d5c9d09e0932411e3ca59614fed89d778bdd2f08035ed1f7"

RPROVIDES:${PN} += "cmake-Qt6Test \
pkgconfig-Qt6Test \
qt6-test-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
libQt6Test6 \
pkgconfig-Qt6Core"

inherit rpm
