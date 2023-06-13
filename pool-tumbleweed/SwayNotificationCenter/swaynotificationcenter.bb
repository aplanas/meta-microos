SUMMARY = "A simple GTK notification daemon"
DESCRIPTION = "A simple notification daemon with a GTK gui for notifications and the control center"
LICENSE = "GPL-3.0-only"

PV = "0.9.0"

RPM_NAME = "SwayNotificationCenter-0.9.0-1.1.aarch64.rpm"
RPM_HASH = "3c7003fa3e633980b5ae0eb8901456d255dc321ec3059a65d53518e995205ee637b313f2b42012bfbc2a15d3379c39199c7adf52cccff4f243f870bd19a525bd"

RPROVIDES:${PN} += "SwayNotificationCenter \
SwayNotificationCenter(aarch-64) \
config(SwayNotificationCenter)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgee-0.8.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libgtk-layer-shell.so.0()(64bit) \
libhandy-1.so.0()(64bit) \
libhandy-1.so.0(LIBHANDY_1_0)(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libpulse-mainloop-glib.so.0()(64bit) \
libpulse-mainloop-glib.so.0(PULSE_0)(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit)"

inherit rpm
