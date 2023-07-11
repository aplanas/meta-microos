SUMMARY = "Non-ABI stable API for the Qt 6 QuickDialogs2Impl library"
DESCRIPTION = "This package provides private headers of libQt6QuickDialogs2Impl that do not \
have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quickdialogs2quickimpl-private-devel-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "84dc2c4b9c40888047fca57192eca9ab7dad26acf3256931fdc8336b62a367ac7c3da4e913bf26b3886a379b269adb039648c702ce02dff5318bb5029f6c77d2"

RPROVIDES:${PN} += "qt6-quickdialogs2quickimpl-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QuickDialogs2QuickImpl"

inherit rpm
