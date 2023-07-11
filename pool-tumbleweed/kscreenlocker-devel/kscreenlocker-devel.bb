SUMMARY = "Library and components for secure lock screen architecture - development files"
DESCRIPTION = "Development files for Library and components for secure lock screen architecture."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.6"

RPM_NAME = "kscreenlocker-devel-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "9037abea6d3224fc677bb28c717e352a4563cd1fc2be46eaf3a8d6561e77320520b6fb376259943c28e36ffdf49e27e3b6e9b1b1eb0648e27621cb4bcb232138"

RPROVIDES:${PN} += "cmake-KScreenLocker \
cmake-ScreenSaverDBusInterface \
kscreenlocker-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
cmake-Qt5X11Extras \
libKScreenLocker5"

inherit rpm
