SUMMARY = "Daemon to use DVB devices"
DESCRIPTION = "DVB Daemon is a daemon written in Vala to setup your DVB devices, \
record and watch TV shows and browse EPG. It can be controlled directly \
via its D-Bus interface or with UI applications that come with it."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.90"

RPM_NAME = "gnome-dvb-daemon-0.2.90-4.11.aarch64.rpm"
RPM_HASH = "c62737709173311f905f227afcb42d5c44097c8e86dfc17072484a345dd7c7ed8579afc7710e4db0fec9df9efd30a77993c0eb578167adb41498ac57b7fe71c3"

RPROVIDES:${PN} += "gnome-dvb-daemon"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstmpegts-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstrtspserver-1.0.so.0 \
libgudev-1.0.so.0 \
libsqlite3.so.0"

inherit rpm
