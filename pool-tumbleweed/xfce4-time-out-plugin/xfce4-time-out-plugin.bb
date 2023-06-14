SUMMARY = "Time-out Plugin for the Xfce Panel"
DESCRIPTION = "The Time-out plugin allows to take breaks from computer work in configurable, \
periodical intervals and will provide a notification and lock the screen each \
the break time has been reached."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.3"

RPM_NAME = "xfce4-time-out-plugin-1.1.3-1.1.aarch64.rpm"
RPM_HASH = "1cea6c6f428e7fc310b51d7d34baabf744a157f83aacdbaeed144a1338eda0377eccf1755899924d5e645200fb749c7e0544bb1fb55d93861c0b24c6d240d616"

RPROVIDES:${PN} += "libtime-out.so \
xfce4-panel-plugin-timeout \
xfce4-time-out-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
xfce4-panel"

inherit rpm
