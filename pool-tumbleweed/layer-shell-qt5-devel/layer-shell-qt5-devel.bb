SUMMARY = "wlr-layer-shell integration for Qt 5 - development files"
DESCRIPTION = "This allows integration of Qt applications with wlr-layer-shell."
LICENSE = "LGPL-3.0-or-later"

PV = "5.27.6"

RPM_NAME = "layer-shell-qt5-devel-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "83820285567e41c6c7136dbae266d3bd7b6c1dfeb2da757deedee892f317e99f3ac00a2691ec18f6fe935dca16993e1cb47b27d0365d22cfd2564baba46a47ec"

RPROVIDES:${PN} += "cmake-LayerShellQt \
layer-shell-qt5-devel"

RDEPENDS:${PN} += "cmake-Qt5Qml \
layer-shell-qt5 \
libqt5-qtwayland-private-headers-devel \
pkgconfig-wayland-client"

inherit rpm
