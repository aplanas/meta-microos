SUMMARY = "Logo Programming Environment"
DESCRIPTION = "KTurtle is an educational Logo programming environment."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kturtle-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "022a88f9555cfb62685951488a277e25e4ec488d3ddeab9ab6f84e30ad40a97042af2f3959fe3855a4e34485f9869c551586315fdca90f21948f38f0d2ca5bc3"

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
