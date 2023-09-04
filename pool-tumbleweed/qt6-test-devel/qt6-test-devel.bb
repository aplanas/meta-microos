SUMMARY = "Development files for the Qt 6 Test library"
DESCRIPTION = "Development files for the Qt 6 Test library."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-test-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "7db2726277e9047b3c9837c12a7ee33eb02084a9c30851e043202cfb4115d3f1f6720a8bc74f437204016f9347aa47fa306663b209985d74013779d467266c0b"

RPROVIDES:${PN} += "cmake-Qt6Test \
pkgconfig-Qt6Test \
qt6-test-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
libQt6Test6 \
pkgconfig-Qt6Core"

inherit rpm
