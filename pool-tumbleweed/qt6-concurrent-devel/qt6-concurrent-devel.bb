SUMMARY = "Development files for the Qt 6 Concurrent library"
DESCRIPTION = "Development files for the Qt 6 Concurrent library."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-concurrent-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "0afb342bc7d3fc1d000b6019b5663381b2d9733dd7cc48de4b24f30eb323087d38423b4ca1ad141377c0b1e786dcd67f052249bacda7dc92c57045a76279fdcc"

RPROVIDES:${PN} += "cmake-Qt6Concurrent \
pkgconfig-Qt6Concurrent \
qt6-concurrent-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
libQt6Concurrent6 \
pkgconfig-Qt6Core"

inherit rpm
