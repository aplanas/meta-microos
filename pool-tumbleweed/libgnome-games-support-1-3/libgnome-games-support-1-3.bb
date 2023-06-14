SUMMARY = "Internal support library for GNOME games"
DESCRIPTION = "libgnome-games-support is a small library intended for internal use by \
GNOME Games, but it may be used by others. The API will only break \
with the major version number. The ABI is unstable."
LICENSE = "LGPL-3.0-or-later"

PV = "1.8.2"

RPM_NAME = "libgnome-games-support-1-3-1.8.2-1.7.aarch64.rpm"
RPM_HASH = "6a23d5514445d4bb8bcc647f3c6d7aee4a522d20bfc21b2fff983d79b6575b773f30d545782c2f0f4bbd75544efe0b5d15eeca6fb21fde6a366fd0841fc09772"

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
