SUMMARY = "wlr-layer-shell integration for Qt 5 - development files"
DESCRIPTION = "This allows integration of Qt applications with wlr-layer-shell."
LICENSE = "LGPL-3.0-or-later"

PV = "5.27.5"

RPM_NAME = "layer-shell-qt5-devel-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "3acdf0755bc0a5b99c8d7909fc8da7e4d7d8bef51e811b82cfdd9a8d252499856f69dc9795e395ac0eb13805375726314b74e8fd481453ddb0390690df8e0745"

RPROVIDES:${PN} += "cmake-LayerShellQt \
layer-shell-qt5-devel"

RDEPENDS:${PN} += "cmake-Qt5Qml \
layer-shell-qt5 \
libqt5-qtwayland-private-headers-devel \
pkgconfig-wayland-client"

inherit rpm
