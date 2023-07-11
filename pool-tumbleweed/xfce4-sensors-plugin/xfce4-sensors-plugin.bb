SUMMARY = "Hardware Sensor Plugin for the Xfce Panel"
DESCRIPTION = "The Sensors plugin and standalone application allow to monitor various hardware \
sensors supported by libsensors."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.4"

RPM_NAME = "xfce4-sensors-plugin-1.4.4-1.4.aarch64.rpm"
RPM_HASH = "c25d4f90addf09e21ece12fcecb351eb982abaf6f041bcdf0d377abc592d47ef61684af1af393470b86f7f4227edc03c34e63e597c9593cfe21cc45ae98be62e"

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
