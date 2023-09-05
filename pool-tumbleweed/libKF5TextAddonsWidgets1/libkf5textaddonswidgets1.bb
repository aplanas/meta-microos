SUMMARY = "User interface widgets for text handling"
DESCRIPTION = "This package provides a library containing graphical widgets to build \
user interfaces handling texts."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.1"

RPM_NAME = "libKF5TextAddonsWidgets1-1.4.1-1.1.aarch64.rpm"
RPM_HASH = "968b06b968ac019655b4536556bd4198365389c6feb608665b2afffaef1323525dc9e744c6f4856ecbe98d233845412387ef39765de9d2f14351ba381dddf040"

RPROVIDES:${PN} += "libKF5TextAddonsWidgets.so.1 \
libKF5TextAddonsWidgets1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5I18n.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
