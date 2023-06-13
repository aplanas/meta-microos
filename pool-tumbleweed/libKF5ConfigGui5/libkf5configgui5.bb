SUMMARY = "Widgets hooks for configuration entities"
DESCRIPTION = "KConfigGui provides a way to hook widgets to the configuration so that they are \
automatically initialized from the configuration and automatically propagate \
their changes to their respective configuration files."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5ConfigGui5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "ce160c6f60a07722208c0c868428d2f5aa4160352f580fe9a1698cee773dd575e0b5dc7c76ce524cd3d9bd84da7416f1b27150c1aa7891eab5fbea0887367b76"

RPROVIDES:${PN} += "libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigGui5 \
libKF5ConfigGui5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Core5 \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Gui5 \
libQt5Xml5 \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
