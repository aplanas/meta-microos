SUMMARY = "Non-ABI stable API for the Qt 6 3DLogic library"
DESCRIPTION = "This package provides private headers of libQt63DLogic that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-3dlogic-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "c766080d4b3f4ced9083735622009a60ee3dabea0983b418c8ad61518433ba43e1dcec1e5fc8842df16c06d4fa741859e962bb2d1cfc37036a74c825f6ae8671"

RPROVIDES:${PN} += "qt6-3dlogic-private-devel"

RDEPENDS:${PN} += "cmake-Qt63DLogic \
qt6-3dcore-private-devel \
qt6-core-private-devel \
qt6-gui-private-devel"

inherit rpm
