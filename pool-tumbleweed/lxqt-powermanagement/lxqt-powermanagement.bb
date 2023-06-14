SUMMARY = "Power Management and Auto-suspend"
DESCRIPTION = "LXQt daemon for power management and auto-suspend"
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "lxqt-powermanagement-1.3.0-1.3.aarch64.rpm"
RPM_HASH = "26565742afb212b9c278089de515af4778c0bd189d968f294ed5c274203c7ac6013e28498a75923dd522bd46de69ea62071e466e12ec73c6af4732f8a26717c9"

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
