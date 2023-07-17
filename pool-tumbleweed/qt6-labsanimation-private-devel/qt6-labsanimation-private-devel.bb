SUMMARY = "Non-ABI stable API for the Qt 6 LabsAnimation library"
DESCRIPTION = "This package provides private headers of libQt6LabsAnimation that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-labsanimation-private-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "b478f1e4ca9522c7abfd97899aa076f7a257b55927d7aec48140a2820be28d3173dccc5dfcf59cc0e5b07b05b200e9fcd44d5812a6cba808d80f5d713c418e29"

RPROVIDES:${PN} += "qt6-labsanimation-private-devel"

RDEPENDS:${PN} += "cmake-Qt6LabsAnimation"

inherit rpm
