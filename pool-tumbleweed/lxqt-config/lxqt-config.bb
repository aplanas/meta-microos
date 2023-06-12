SUMMARY = "LXQt Control Center"
DESCRIPTION = "System Configuration and Control Center for LXQt"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "lxqt-config-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "4bddef414040e96f76943011088b32d7cf9cd4b504d2ce4d5c3784dbca73e15017d3cf0d89ba06084cab780186eb535bb7258024f608eb5217a108c2a6618d19"

RPROVIDES:${PN} += "application() \
application(lxqt-config-appearance.desktop) \
application(lxqt-config-brightness.desktop) \
application(lxqt-config-file-associations.desktop) \
application(lxqt-config-input.desktop) \
application(lxqt-config-locale.desktop) \
application(lxqt-config-monitor.desktop) \
application(lxqt-config.desktop) \
config(lxqt-config) \
liblxqt-config-cursor.so()(64bit) \
lxqt-config \
lxqt-config(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
desktop-file-utils \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5Screen.so.8()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5X11Extras.so.5()(64bit) \
libQt5X11Extras.so.5(Qt_5)(64bit) \
libQt5Xdg.so.3()(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libX11.so.6()(64bit) \
libXcursor.so.1()(64bit) \
libXfixes.so.3()(64bit) \
libXi.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
liblxqt.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
libxcb-randr.so.0()(64bit) \
libxcb.so.1()(64bit) \
libz.so.1()(64bit)"

inherit rpm
