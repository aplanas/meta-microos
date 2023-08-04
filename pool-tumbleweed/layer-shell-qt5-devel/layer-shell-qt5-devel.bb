SUMMARY = "wlr-layer-shell integration for Qt 5 - development files"
DESCRIPTION = "This allows integration of Qt applications with wlr-layer-shell."
LICENSE = "LGPL-3.0-or-later"

PV = "5.27.7"

RPM_NAME = "layer-shell-qt5-devel-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "3a676ea70c36abcc3678c6f595c3f513c25a1b344b7836dca78930b1a95a2a19b038b09909acc9744cb2a55ab2ddcd9db6030c63ee7a56f1941144e79331cc6a"

RPROVIDES:${PN} += "cmake-LayerShellQt \
layer-shell-qt5-devel"

RDEPENDS:${PN} += "cmake-Qt5Qml \
layer-shell-qt5 \
libqt5-qtwayland-private-headers-devel \
pkgconfig-wayland-client"

inherit rpm
