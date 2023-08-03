SUMMARY = "Non-ABI stable API for the Qt 6 Quick3D library"
DESCRIPTION = "This package provides private headers of libQt6Quick3D that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-quick3d-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "2f512f5861566c83b4e12ba22dbd419732eff11fa1822fc9db982d96752540f8cce162c715b949d907928bc2b81c7c106aa72ebc4597d4d5813d58db51f845b8"

RPROVIDES:${PN} += "qt6-quick3d-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Quick3D \
qt6-core-private-devel \
qt6-gui-private-devel \
qt6-qml-private-devel \
qt6-quick-private-devel \
qt6-quick3druntimerender-private-devel"

inherit rpm
