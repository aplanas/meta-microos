SUMMARY = "Desktop presentation application"
DESCRIPTION = "Spice-up is a desktop presentation application \
based upon SpiceOfDesign's presentation concept."
LICENSE = "GPL-3.0-only"

PV = "1.9.1"

RPM_NAME = "spice-up-1.9.1-1.8.aarch64.rpm"
RPM_HASH = "25d1b7815cbf79c8eb893622a399b166de3b954498d61ebf939478c4236e1f0237fadc9b641bfc4626d3d5df0b9f48565983a43fda1ea26866ed62ef143a666a"

RPROVIDES:${PN} += "spice-up"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libevdev.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgtk-3.so.0 \
libgudev-1.0.so.0 \
libjson-glib-1.0.so.0 \
libpango-1.0.so.0"

inherit rpm
