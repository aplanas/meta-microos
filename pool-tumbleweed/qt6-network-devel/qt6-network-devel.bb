SUMMARY = "Development files for the Qt 6 Network library"
DESCRIPTION = "Development files for the Qt 6 Network library."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-network-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "a5def6c2060e21c636ba283a6a7bfefa45b1017f7677bc901f8d1752ab305fd5790aedbc2ad785f3fab201a985050c4c7a86b310d2cbeb3c41e240efe9d2f931"

RPROVIDES:${PN} += "cmake-Qt6Network \
pkgconfig-Qt6Network \
qt6-network-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
libQt6Network6 \
pkgconfig-Qt6Core"

inherit rpm
