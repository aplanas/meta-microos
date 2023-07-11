SUMMARY = "Power Management and Auto-suspend"
DESCRIPTION = "LXQt daemon for power management and auto-suspend"
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "lxqt-powermanagement-1.3.0-1.4.aarch64.rpm"
RPM_HASH = "74c985255db122b2d238c0c42917d22fea29f76a87c57e5574fed87a08960058ca1d205aa6c7943cfada1a4ddbfb9610d481db404d1467f395913806fbe19b0d"

RPROVIDES:${PN} += "config-lxqt-powermanagement \
lxqt-powermanagement"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5IdleTime.so.5 \
libKF5Solid.so.5 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Gui5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5Xdg.so.3 \
libc.so.6 \
liblxqt-globalkeys.so.1 \
liblxqt.so.1 \
libm.so.6 \
libstdc++.so.6 \
upower"

inherit rpm
