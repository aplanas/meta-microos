SUMMARY = "GeoLocation Framework"
DESCRIPTION = "GeoClue is a software framework which can be used to enable geospatial \
awareness in applications. GeoClue uses the D-Bus inter-process \
communication mechanism to provide location information"
LICENSE = "GPL-2.0-or-later"

PV = "2.7.0"

RPM_NAME = "geoclue2-2.7.0-1.3.aarch64.rpm"
RPM_HASH = "9f9795f4129b9d63409511202848572d1620707bb319932a5435b19e16474a41dcc5e5bbad2072cc4dcdd46bd9adb0672bb95caeeab4c83ab7d77c6171504925"

RPROVIDES:${PN} += "application() \
application(geoclue-demo-agent.desktop) \
application(geoclue-where-am-i.desktop) \
config(geoclue2) \
dbus(org.freedesktop.GeoClue2) \
geoclue2 \
geoclue2(aarch-64) \
libgeoclue-2.so.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libavahi-client.so.3()(64bit) \
libavahi-common.so.3()(64bit) \
libavahi-glib.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libmm-glib.so.0()(64bit) \
libnotify.so.4()(64bit) \
libsoup-3.0.so.0()(64bit) \
systemd \
user(srvGeoClue)"

inherit rpm
