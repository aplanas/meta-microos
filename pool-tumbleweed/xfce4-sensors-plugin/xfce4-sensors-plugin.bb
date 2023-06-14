SUMMARY = "Hardware Sensor Plugin for the Xfce Panel"
DESCRIPTION = "The Sensors plugin and standalone application allow to monitor various hardware \
sensors supported by libsensors."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.4"

RPM_NAME = "xfce4-sensors-plugin-1.4.4-1.3.aarch64.rpm"
RPM_HASH = "8ab6f4645246aefd7d4c5fc9fc1febf8dd1db23ea152fcb5c085f22266e9bf4799cfd82c1a7a81a83a4b7f7a06fc13494aa7ccf8fa1c2b725b36de3a6c9ff365"

RPROVIDES:${PN} += "libxfce4-sensors-plugin.so \
libxfce4sensors.so.5 \
xfce4-panel-plugin-sensors \
xfce4-sensors-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libnotify.so.4 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libsensors.so.4 \
libstdc++.so.6 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
xfce4-panel"

inherit rpm
