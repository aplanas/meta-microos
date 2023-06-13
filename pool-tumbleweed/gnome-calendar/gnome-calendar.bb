SUMMARY = "A calendar application for GNOME"
DESCRIPTION = "Calendar is a calendar application for GNOME."
LICENSE = "GPL-3.0-or-later"

PV = "44.1"

RPM_NAME = "gnome-calendar-44.1-1.1.aarch64.rpm"
RPM_HASH = "d5384b9c4b8de68f2039c3393d2e89532b620fcc4de41642e7af6db7c719156d93bbc70f0ae5fecba9c3f5b243d6fe8ec2a37893b061355f4317b12af3943ea2"

RPROVIDES:${PN} += "application() \
application(org.gnome.Calendar.desktop) \
gnome-calendar \
gnome-calendar(aarch-64) \
metainfo() \
metainfo(org.gnome.Calendar.appdata.xml) \
mimehandler(text/calendar)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libadwaita-1.so.0()(64bit) \
libadwaita-1.so.0(LIBADWAITA_1_0)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libecal-2.0.so.2()(64bit) \
libedataserver-1.2.so.27()(64bit) \
libedataserverui4-1.0.so.0()(64bit) \
libgeoclue-2.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgraphene-1.0.so.0()(64bit) \
libgtk-4.so.1()(64bit) \
libgweather-4.so.0()(64bit) \
libical-glib.so.3()(64bit) \
libpango-1.0.so.0()(64bit) \
libsoup-3.0.so.0()(64bit)"

inherit rpm
