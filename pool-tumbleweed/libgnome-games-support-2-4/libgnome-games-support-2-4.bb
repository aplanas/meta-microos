SUMMARY = "Internal support library for GNOME games"
DESCRIPTION = "libgnome-games-support is a small library intended for internal use by \
GNOME Games, but it may be used by others. The API will only break \
with the major version number. The ABI is unstable."
LICENSE = "LGPL-3.0-or-later"

PV = "2.0.0"

RPM_NAME = "libgnome-games-support-2-4-2.0.0-1.8.aarch64.rpm"
RPM_HASH = "0444cc023899d6a09319f2dee8a4894440e7278290f00d78d855d287e9e3e1d1b2a9bc58d3b7ab04139e05ebe1e4eb17858b3d3149f88bda41ec1e8698564cea"

RPROVIDES:${PN} += "libgnome-games-support \
libgnome-games-support-2-4 \
libgnome-games-support-2.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1"

inherit rpm
