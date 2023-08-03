SUMMARY = "Development files for the Qt 6 Bodymovin library"
DESCRIPTION = "This package provides private headers of libQt6Bodymovin that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-bodymovin-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "522f9b095a8462a9fbd44e228a31d76a7f48585727c7a2d63b08d8052bc4c54a86214980be9df79dd8295278cd072dd02bd729b22628a8ab5499243180f93cf6"

RPROVIDES:${PN} += "cmake-Qt6BodymovinPrivate \
qt6-bodymovin-devel \
qt6-bodymovin-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Gui \
qt6-gui-private-devel"

inherit rpm
