SUMMARY = "Development files for the Qt 6 Network library"
DESCRIPTION = "Development files for the Qt 6 Network library."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-network-devel-6.5.1-4.1.aarch64.rpm"
RPM_HASH = "63f5f56d56bab234001e4afd23110a1671858bb9a2ab89406e7c2161561c4a28b042517cd90f4d69494cc08b281a1199244ade6f066302914463f749e65f286e"

RPROVIDES:${PN} += "cmake-Qt6Network \
pkgconfig-Qt6Network \
qt6-network-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
libQt6Network6 \
pkgconfig-Qt6Core"

inherit rpm
