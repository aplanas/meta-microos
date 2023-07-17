SUMMARY = "Non-ABI stable API for the Qt 6 VirtualKeyboard library"
DESCRIPTION = "This package provides private headers of libQt6VirtualKeyboard that do not have \
any ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-virtualkeyboard-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "a182037e00c093f3ecca49fc35fc2957a8108689f1cc4b32c5578e89c11e3cbead6ddcf63625886d564d0b0cf30fbc91e189bbf8f1f83871c2e9d223068b6c9d"

RPROVIDES:${PN} += "qt6-virtualkeyboard-private-devel"

RDEPENDS:${PN} += "cmake-Qt6VirtualKeyboard \
qt6-core-private-devel \
qt6-gui-private-devel"

inherit rpm
