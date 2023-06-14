SUMMARY = "Mutter based compositor for kiosks"
DESCRIPTION = "Kiosk provides a desktop enviroment suitable for fixed purpose, or single \
application deployments like wall displays and point-of-sale systems."
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-kiosk-44.0-1.1.aarch64.rpm"
RPM_HASH = "0182271e960587aa20b1982971e7813e42061c6206086a7471d761ce6c11901edaee0a1f7089b84ac0e9d0c306ba2c943983e09abdac2e9dd219acc5f795903a"

RPROVIDES:${PN} += "gnome-kiosk"

RDEPENDS:${PN} += "/usr/bin/sh \
gnome-session \
ld-linux-aarch64.so.1 \
libGLESv2.so.2 \
libX11.so.6 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnome-desktop-3.so.20 \
libgobject-2.0.so.0 \
libibus-1.0.so.5 \
libmutter-12.so.0 \
libmutter-clutter-12.so.0 \
libsystemd.so.0"

inherit rpm
