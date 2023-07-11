SUMMARY = "Non-ABI stable API for the Qt 6 Multimedia Library"
DESCRIPTION = "This package provides private headers of libQt6Multimedia that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-multimedia-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "864bff5ccfe6a2491fa1bb82cac28b31120afe22896229035d779d348c2891f3ea99e79ad715813e8c7e098a5735ed7f9c439475eabe12c974f65cb237d0f360"

RPROVIDES:${PN} += "qt6-multimedia-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Multimedia"

inherit rpm
