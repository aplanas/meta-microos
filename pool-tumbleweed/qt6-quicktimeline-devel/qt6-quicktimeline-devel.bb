SUMMARY = "Qt 6 QuickTimeline library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickTimeline library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quicktimeline-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "e47bc752ee2ecde60f83b8d9c00a5d63beadc03b4ab285eb925a1933179ef8bcb1ac7b5e68315567deadcc60b01de684fa2f7830e394b2cda30ad020c3c4f2ed"

RPROVIDES:${PN} += "cmake(Qt6QuickTimeline) \
pkgconfig(Qt6QuickTimeline) \
qt6-quicktimeline-devel \
qt6-quicktimeline-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake(Qt6Qml) \
cmake(Qt6Quick) \
libQt6QuickTimeline6 \
pkgconfig(Qt6Core) \
pkgconfig(Qt6Qml) \
pkgconfig(Qt6Quick)"

inherit rpm
