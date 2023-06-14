SUMMARY = "A calendar application for GNOME"
DESCRIPTION = "Calendar is a calendar application for GNOME."
LICENSE = "GPL-3.0-or-later"

PV = "44.1"

RPM_NAME = "gnome-calendar-44.1-1.1.aarch64.rpm"
RPM_HASH = "d5384b9c4b8de68f2039c3393d2e89532b620fcc4de41642e7af6db7c719156d93bbc70f0ae5fecba9c3f5b243d6fe8ec2a37893b061355f4317b12af3943ea2"

RPROVIDES:${PN} += "gnome-calendar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libecal-2.0.so.2 \
libedataserver-1.2.so.27 \
libedataserverui4-1.0.so.0 \
libgeoclue-2.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgtk-4.so.1 \
libgweather-4.so.0 \
libical-glib.so.3 \
libpango-1.0.so.0 \
libsoup-3.0.so.0"

inherit rpm
