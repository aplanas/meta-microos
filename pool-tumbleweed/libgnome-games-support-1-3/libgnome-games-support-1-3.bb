SUMMARY = "Internal support library for GNOME games"
DESCRIPTION = "libgnome-games-support is a small library intended for internal use by \
GNOME Games, but it may be used by others. The API will only break \
with the major version number. The ABI is unstable."
LICENSE = "LGPL-3.0-or-later"

PV = "1.8.2"

RPM_NAME = "libgnome-games-support-1-3-1.8.2-1.8.aarch64.rpm"
RPM_HASH = "3daea7e12378bd32ed2ba751cac043b23ffa6263299d8f556d3031ec7cf757f989b08fb51b57d81ba1371c39b42ec3368466b89b2a3ae351ef8d220d75b8b359"

RPROVIDES:${PN} += "libgnome-games-support-1-3 \
libgnome-games-support-1.so.3 \
libgnome-games-support1-3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
