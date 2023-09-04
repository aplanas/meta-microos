SUMMARY = "Development Files for Qt Quick Controls 2 Desktop Style"
DESCRIPTION = "This file contains cmake files to be used by projects that depend on \
qqc2-desktop-style. \
Usually not needed as it is only a runtime dependency."
LICENSE = "GPL-2.0-or-later"

PV = "5.109.0"

RPM_NAME = "qqc2-desktop-style-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "83f9cf51155465376c7af5f54cd76be1e75343c6fa2a12901a3f1fadca88284a039c432b917fa959f736d6c27f89be3dd37b58fa37316012b581f2a3a71b4998"

RPROVIDES:${PN} += "cmake-KF5QQC2DeskopStyle \
cmake-KF5QQC2DesktopStyle \
qqc2-desktop-style-devel"

RDEPENDS:${PN} += "extra-cmake-modules \
qqc2-desktop-style"

inherit rpm
