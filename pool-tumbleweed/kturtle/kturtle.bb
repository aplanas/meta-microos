SUMMARY = "Logo Programming Environment"
DESCRIPTION = "KTurtle is an educational Logo programming environment."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kturtle-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "510f1b4a8f57848021764b605ccceedc270280462dbdf46acfcdd2a1cad4a7273f2eb6e2697b1003359c16b8e54c217c1ef5c9e4e05c406c92713f55a727da7d"

RPROVIDES:${PN} += "config-kturtle \
kturtle \
kturtle5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKF5NewStuffCore.so.5 \
libKF5NewStuffWidgets.so.5 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
