SUMMARY = "Development Files for Qt Quick Controls 2 Desktop Style"
DESCRIPTION = "This file contains cmake files to be used by projects that depend on \
qqc2-desktop-style. \
Usually not needed as it is only a runtime dependency."
LICENSE = "GPL-2.0-or-later"

PV = "5.106.0"

RPM_NAME = "qqc2-desktop-style-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "3fd25591ae20115b705318b9616662a3d917c73403a20c6004ff3bb1f17b2082f8c402160e455047aac53dbee90c4cd0f8b994e88dfa1e2e62dba994c8d37abf"

RPROVIDES:${PN} += "cmake(KF5QQC2DeskopStyle) \
cmake(KF5QQC2DesktopStyle) \
qqc2-desktop-style-devel \
qqc2-desktop-style-devel(aarch-64)"

RDEPENDS:${PN} += "extra-cmake-modules \
qqc2-desktop-style"

inherit rpm
