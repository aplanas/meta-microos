SUMMARY = "Qt6 QuickTestUtils static library"
DESCRIPTION = "The Qt6 QuickTestUtils static library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quicktestutils-devel-static-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "67284f34c9da7b12095a99c38b379079ab2b820154148ba02d912538e6ad23758e41b10e808b8e738f4fe1be75a59933c09cb69c05fb5b24c75df0318548d4c7"

RPROVIDES:${PN} += "cmake-Qt6QuickTestUtilsPrivate \
qt6-quicktestutils-devel-static"

RDEPENDS:${PN} += "cmake-Qt6Qml \
cmake-Qt6QuickTest \
cmake-Qt6Test \
qt6-quick-private-devel"

inherit rpm
