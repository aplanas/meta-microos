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

RPROVIDES:${PN} += "application() \
application(gnome-radio.desktop) \
girl \
gnome-internet-radio-locator \
gnome-radio \
gnome-radio(aarch-64) \
metainfo() \
metainfo(gnome-radio.appdata.xml) \
mimehandler(application/gnome-radio)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libchamplain-0.12.so.0()(64bit) \
libchamplain-gtk-0.12.so.0()(64bit) \
libclutter-1.0.so.0()(64bit) \
libclutter-gtk-1.0.so.0()(64bit) \
libgeoclue-2.so.0()(64bit) \
libgeocode-glib.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstplayer-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libwayland-server.so.0()(64bit) \
libxml2.so.2()(64bit)"

inherit rpm
