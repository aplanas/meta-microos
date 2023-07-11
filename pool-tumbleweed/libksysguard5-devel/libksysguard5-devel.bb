SUMMARY = "Task management and system monitoring library -- devel files"
DESCRIPTION = "Task management and system monitoring library. This package contains development \
files."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.6"

RPM_NAME = "libksysguard5-devel-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "1e48e7daed0650dc6f7a77a03b91a3dba6f732cca8bb812e61208bcd14b5716c8889f1132d7b8c887e8d5eb39935ae61154c45b987f1ccab090f49ee6bef9885"

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
