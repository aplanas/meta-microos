SUMMARY = "GeoLocation Framework"
DESCRIPTION = "GeoClue is a software framework which can be used to enable geospatial \
awareness in applications. GeoClue uses the D-Bus inter-process \
communication mechanism to provide location information"
LICENSE = "GPL-2.0-or-later"

PV = "2.7.0"

RPM_NAME = "geoclue2-2.7.0-1.4.aarch64.rpm"
RPM_HASH = "e5c2aaa44c5e030167ff7d578cdb0c1f0fef628a43f3695a6623168695819700088033bf9be2eb8cda28537b4daa05b160316089210c91f984332cfd0b6d76cb"

RPROVIDES:${PN} += "config-geoclue2 \
dbus-org.freedesktop.GeoClue2 \
geoclue2 \
libgeoclue-2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libavahi-glib.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0 \
libm.so.6 \
libmm-glib.so.0 \
libnotify.so.4 \
libsoup-3.0.so.0 \
systemd \
user-srvGeoClue"

inherit rpm
