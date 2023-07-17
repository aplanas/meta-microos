SUMMARY = "Development files for the Qt 6 Test library"
DESCRIPTION = "Development files for the Qt 6 Test library."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-test-devel-6.5.1-4.1.aarch64.rpm"
RPM_HASH = "60323652e306c4bee804ae50682e562e843c7848aa77f2050a0de28c5b5428d5c224eadbbe8005f5dfe9c143b4268aaa8451d014cb16df601b2e94972e1709a4"

RPROVIDES:${PN} += "cmake-Qt6Test \
pkgconfig-Qt6Test \
qt6-test-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
libQt6Test6 \
pkgconfig-Qt6Core"

inherit rpm
