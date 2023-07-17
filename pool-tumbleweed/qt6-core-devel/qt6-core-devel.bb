SUMMARY = "Development files for the Qt 6 Core library"
DESCRIPTION = "Development files for the Qt 6 Core library."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-core-devel-6.5.1-4.1.aarch64.rpm"
RPM_HASH = "5ce7f7270b59b95e2208d74f6f723b8d86f0b7750a4e4d40945d4b912acc381f88f97030879f5f1aadd109f2473b9159c9434666d0091dd59a56dc40361b7e0b"

RPROVIDES:${PN} += "cmake-Qt6Core \
cmake-Qt6CoreTools \
pkgconfig-Qt6Core \
qt6-core-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt6Core6 \
pkgconfig-Qt6Platform \
qt6-base-common-devel"

inherit rpm
