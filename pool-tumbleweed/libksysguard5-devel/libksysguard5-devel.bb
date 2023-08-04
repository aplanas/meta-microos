SUMMARY = "Task management and system monitoring library -- devel files"
DESCRIPTION = "Task management and system monitoring library. This package contains development \
files."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "libksysguard5-devel-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "ba041071d6a2a561ebc7bc5b819ff421574b89e8fceda33d1b0dbc8463f2c78901f25f96718ee93224a13bf5f4527d067cd8c88bc5e8085d805afd368f91dd4c"

RPROVIDES:${PN} += "cmake-KF5SysGuard \
cmake-KSysGuard \
libksysguard5-devel"

RDEPENDS:${PN} += "cmake-KF5Config \
cmake-KF5I18n \
cmake-KF5IconThemes \
cmake-Qt5Core \
cmake-Qt5DBus \
cmake-Qt5Network \
cmake-Qt5Widgets \
ld-linux-aarch64.so.1 \
libKSysGuardSystemStats1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libksignalplotter.so.9 \
libksysguard5 \
liblsofui.so.9 \
libprocessui.so.9 \
libstdc++.so.6"

inherit rpm
