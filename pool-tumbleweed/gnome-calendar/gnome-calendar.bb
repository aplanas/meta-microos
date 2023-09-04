SUMMARY = "A calendar application for GNOME"
DESCRIPTION = "Calendar is a calendar application for GNOME."
LICENSE = "GPL-3.0-or-later"

PV = "44.1"

RPM_NAME = "gnome-calendar-44.1-2.1.aarch64.rpm"
RPM_HASH = "5459f249143c41d4b0d4920b20126ab0a6f8bd31e7d14d6cab1cfaeac9a39e5940b2e4768e5112ecd5a3c8fb5ff8a5b554dad1f6bb39efd37ef0292cb24ea7bf"

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
