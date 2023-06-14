SUMMARY = "Live Internet radio broadcaster discovery program"
DESCRIPTION = "GNOME Radio is a Free Software program that allows you to easily \
locate Free Internet Radio stations by broadcasters on the Internet \
with the help of map and text search.  GNOME Radio is developed on \
the GNOME desktop platform and it requires at least GStreamer 1.0 \
for playback.  Enjoy Free Internet Radio."
LICENSE = "GPL-3.0-or-later"

PV = "64.0"

RPM_NAME = "gnome-radio-64.0-1.1.aarch64.rpm"
RPM_HASH = "37354f3df854802fdf42f6118388e4beaeef36fb829207440ded79fc46d873a7b646a0a3bcbe9465f2170eab51882a2057b64659628ee5218716471513d79a3e"

RPROVIDES:${PN} += "girl \
gnome-internet-radio-locator \
gnome-radio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libchamplain-0.12.so.0 \
libchamplain-gtk-0.12.so.0 \
libclutter-1.0.so.0 \
libclutter-gtk-1.0.so.0 \
libgeoclue-2.so.0 \
libgeocode-glib.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstplayer-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0 \
libwayland-server.so.0 \
libxml2.so.2"

inherit rpm
