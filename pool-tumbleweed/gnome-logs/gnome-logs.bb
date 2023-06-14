SUMMARY = "GNOME System Log Viewer"
DESCRIPTION = "A utility for viewing detailed event logs for the system."
LICENSE = "GPL-3.0-or-later"

PV = "43.0"

RPM_NAME = "gnome-logs-43.0-1.3.aarch64.rpm"
RPM_HASH = "a7dd0312245c28360323a4d0cf9381474908dd856f70366d18ee7734a9d8188f61a1f4660b12a5e792692fbb3bc49b43776eb66a737e3b750a9c8cfa8f12aac4"

RPROVIDES:${PN} += "gnome-logs"

RDEPENDS:${PN} += "gsettings-desktop-schemas \
ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libpango-1.0.so.0 \
libsystemd.so.0"

inherit rpm
