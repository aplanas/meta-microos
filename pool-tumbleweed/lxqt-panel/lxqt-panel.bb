SUMMARY = "Desktop Panel for LXQt"
DESCRIPTION = "Brand new desktop Panel for LXQt"
LICENSE = "GPL-2.0-or-later"

PV = "1.3.0"

RPM_NAME = "lxqt-panel-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "aee1699cdf0bb42af98522c92ce9efb71ecd1378928c0da6da07b4b3fe462ea274660092459d5970dfdb0f51dedb1dd5cad5d72a82a4bd02a9d2b4adf5e6f571"

RPROVIDES:${PN} += "config(lxqt-panel) \
libbacklight.so()(64bit) \
libcolorpicker.so()(64bit) \
libcpuload.so()(64bit) \
libcustomcommand.so()(64bit) \
libdirectorymenu.so()(64bit) \
libdom.so()(64bit) \
libkbindicator.so()(64bit) \
libmount.so()(64bit) \
libnetworkmonitor.so()(64bit) \
libqeyes.so()(64bit) \
libsensors.so()(64bit) \
libsysstat.so()(64bit) \
libvolume.so()(64bit) \
lxqt-panel \
lxqt-panel(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5Solid.so.5()(64bit) \
libKF5WindowSystem.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
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
libXtst.so.6()(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdbusmenu-qt5.so.2()(64bit) \
liblxqt-globalkeys-ui.so.1()(64bit) \
liblxqt-globalkeys.so.1()(64bit) \
liblxqt.so.1()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
libsensors.so.4()(64bit) \
libstatgrab.so.10()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libsysstat-qt5.so.0()(64bit) \
libxcb-composite.so.0()(64bit) \
libxcb-damage.so.0()(64bit) \
libxcb-image.so.0()(64bit) \
libxcb-shape.so.0()(64bit) \
libxcb-util.so.1()(64bit) \
libxcb-xkb.so.1()(64bit) \
libxcb.so.1()(64bit) \
libxkbcommon-x11.so.0()(64bit) \
libxkbcommon-x11.so.0(V_0.5.0)(64bit) \
libxkbcommon.so.0()(64bit) \
libxkbcommon.so.0(V_0.5.0)(64bit) \
lxmenu-data"

inherit rpm
