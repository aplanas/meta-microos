SUMMARY = "Mutter based compositor for kiosks"
DESCRIPTION = "Kiosk provides a desktop enviroment suitable for fixed purpose, or single \
application deployments like wall displays and point-of-sale systems."
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-kiosk-44.0-1.2.aarch64.rpm"
RPM_HASH = "7df85dfff8688d1f2060509cc697d68ee950918e34722585acf91b32d947e47626494df6ce248c2a1310f206d0c202fd71a72a4ee605995e11d4772a145475a1"

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
