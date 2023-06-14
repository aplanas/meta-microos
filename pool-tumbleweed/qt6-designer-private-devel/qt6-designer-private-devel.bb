SUMMARY = "Non-ABI stable API for the Qt 6 Designer libraries"
DESCRIPTION = "This package provides private headers of libQt6Designer that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "qt6-designer-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "68d0502ff862c271ba8cf07511d7a150e18eb93c3f56b89f870cb3d6ec3eb8dc7a6212be7c6ecdfd883cc3d97c2e0fdd2064915cec4c0fcd2f87033b7e5b98d5"

RPROVIDES:${PN} += "qt6-designer-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Designer \
qt6-core-private-devel \
qt6-gui-private-devel \
qt6-widgets-private-devel"

inherit rpm
