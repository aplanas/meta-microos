SUMMARY = "Editor Widget library for the property editing framework"
DESCRIPTION = "The editor widget library for the property editing framework similar to what is known from Qt Designer"
LICENSE = "LGPL-2.0-only"

PV = "3.2.0"

RPM_NAME = "libKPropertyWidgets3-4-3.2.0-2.21.aarch64.rpm"
RPM_HASH = "7304c9c65b9bb898eef66cc2a04509414e61cd11c8f09b0a65ee32ff04916efeb7d930ab0ed08e4c8876ff197ef0b3b348e41a3c931a7405cf830bc2edbac3a4"

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
