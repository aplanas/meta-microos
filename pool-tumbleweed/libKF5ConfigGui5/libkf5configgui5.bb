SUMMARY = "Widgets hooks for configuration entities"
DESCRIPTION = "KConfigGui provides a way to hook widgets to the configuration so that they are \
automatically initialized from the configuration and automatically propagate \
their changes to their respective configuration files."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5ConfigGui5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "3c9f047eb66f934fabe4d1de122bd984a85def2c8eda9d2813085cf40e450c7f1ee10e368248e37ed048e1835a235c60e638ccd388b7e0dbc65599e00e8c6365"

RPROVIDES:${PN} += "libKF5ConfigGui.so.5 \
libKF5ConfigGui5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5Gui.so.5 \
libQt5Gui5 \
libQt5Xml5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
