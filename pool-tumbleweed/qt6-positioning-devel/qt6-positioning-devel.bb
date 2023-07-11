SUMMARY = "Qt 6 Positioning library - Development files"
DESCRIPTION = "Development files for the Qt 6 Positioning library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-positioning-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "28d2281a2e3f11a3615ac2a95e5177dec89364d43f1f6fa2e5c5d7da4566d44f18bdf622e76089675b601ff88fcaf06ac801cdf0ddd7fc2924a986b603de8ecb"

RPROVIDES:${PN} += "cmake-Qt6Positioning \
pkgconfig-Qt6Positioning \
qt6-positioning-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
libQt6Positioning6 \
pkgconfig-Qt6Core"

inherit rpm
