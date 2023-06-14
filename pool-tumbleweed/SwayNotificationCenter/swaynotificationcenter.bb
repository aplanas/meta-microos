SUMMARY = "A simple GTK notification daemon"
DESCRIPTION = "A simple notification daemon with a GTK gui for notifications and the control center"
LICENSE = "GPL-3.0-only"

PV = "0.9.0"

RPM_NAME = "SwayNotificationCenter-0.9.0-1.1.aarch64.rpm"
RPM_HASH = "3c7003fa3e633980b5ae0eb8901456d255dc321ec3059a65d53518e995205ee637b313f2b42012bfbc2a15d3379c39199c7adf52cccff4f243f870bd19a525bd"

RPROVIDES:${PN} += "SwayNotificationCenter \
config-SwayNotificationCenter"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtk-layer-shell.so.0 \
libhandy-1.so.0 \
libjson-glib-1.0.so.0 \
libpango-1.0.so.0 \
libpulse-mainloop-glib.so.0 \
libpulse.so.0"

inherit rpm
