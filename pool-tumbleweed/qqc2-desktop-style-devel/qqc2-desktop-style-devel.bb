SUMMARY = "Development Files for Qt Quick Controls 2 Desktop Style"
DESCRIPTION = "This file contains cmake files to be used by projects that depend on \
qqc2-desktop-style. \
Usually not needed as it is only a runtime dependency."
LICENSE = "GPL-2.0-or-later"

PV = "5.108.0"

RPM_NAME = "qqc2-desktop-style-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "6cfb61b71a9e10f4894797f3a8b977e0170e505d4d19878623cba2d9e5c291bfaf62ce3d301fa52bbb90ad468b8d620486342a54b910ede813dc7df8543304a6"

RPROVIDES:${PN} += "cmake-KF5QQC2DeskopStyle \
cmake-KF5QQC2DesktopStyle \
qqc2-desktop-style-devel"

RDEPENDS:${PN} += "extra-cmake-modules \
qqc2-desktop-style"

inherit rpm
