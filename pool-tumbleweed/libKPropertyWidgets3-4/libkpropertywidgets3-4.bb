SUMMARY = "Editor Widget library for the property editing framework"
DESCRIPTION = "The editor widget library for the property editing framework similar to what is known from Qt Designer"
LICENSE = "LGPL-2.0-only"

PV = "3.2.0"

RPM_NAME = "libKPropertyWidgets3-4-3.2.0-2.22.aarch64.rpm"
RPM_HASH = "b2e01d528c07a0e5ed17959f279544dab49ff61e885abfd69e0559d9b620c1892bcda170a886af10217bccf8224fa6ec31bed130a004480b1ca2e533e2846353"

RPROVIDES:${PN} += "libKPropertyWidgets3-4 \
libKPropertyWidgets3.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
kproperty \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5GuiAddons.so.5 \
libKF5WidgetsAddons.so.5 \
libKPropertyCore3.so.4 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
