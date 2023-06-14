SUMMARY = "Daemon to use DVB devices"
DESCRIPTION = "DVB Daemon is a daemon written in Vala to setup your DVB devices, \
record and watch TV shows and browse EPG. It can be controlled directly \
via its D-Bus interface or with UI applications that come with it."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.90"

RPM_NAME = "gnome-dvb-daemon-0.2.90-4.10.aarch64.rpm"
RPM_HASH = "92d6d0fa25a637f0262a2054e86949fabcb25ea7ccf3f139706837f06c60f09447705899ba363b685e2c4a3a36e11401304cfa2044e12cb17b07fbf084c2602a"

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
