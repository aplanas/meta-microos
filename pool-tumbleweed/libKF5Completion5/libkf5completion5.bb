SUMMARY = "Widgets with advanced completion support"
DESCRIPTION = "KCompletion provides widgets with advanced completion support as well as a \
lower-level completion class which can be used with your own widgets."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5Completion5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "c359c01f44c7360c3ebba2518f55d57d3437074d9fac304b87039d11fabcbcf7ddffd2b79c7f89a3df3dbc710f56ea45a458bbbfff74c2672cdf468a76085335"

RPROVIDES:${PN} += "libKF5Completion.so.5 \
libKF5Completion5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
