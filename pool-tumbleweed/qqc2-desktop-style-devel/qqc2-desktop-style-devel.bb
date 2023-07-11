SUMMARY = "Development Files for Qt Quick Controls 2 Desktop Style"
DESCRIPTION = "This file contains cmake files to be used by projects that depend on \
qqc2-desktop-style. \
Usually not needed as it is only a runtime dependency."
LICENSE = "GPL-2.0-or-later"

PV = "5.107.0"

RPM_NAME = "qqc2-desktop-style-devel-5.107.0-1.2.aarch64.rpm"
RPM_HASH = "217a9e8139fb109f97081e489157bbd76c57146bb2a3a5e8a55a47d0d83d4d4ee63bedaeaad44cb97edf21b6ca1e2bf71bb47788286524619060452ac363c52c"

RPROVIDES:${PN} += "cmake-KF5QQC2DeskopStyle \
cmake-KF5QQC2DesktopStyle \
qqc2-desktop-style-devel"

RDEPENDS:${PN} += "extra-cmake-modules \
qqc2-desktop-style"

inherit rpm
