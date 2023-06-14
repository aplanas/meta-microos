SUMMARY = "System resources viewer for GNOME"
DESCRIPTION = "GNOME Usage is a program to view information about the use of system \
resources, like memory and disk space."
LICENSE = "GPL-3.0-only"

PV = "3.38.1"

RPM_NAME = "gnome-usage-3.38.1-1.10.aarch64.rpm"
RPM_HASH = "b2b707a5d1b60930812f2e473252b79a02b4a5e64aecc1faab1e6de94e3e34a04dee587eab9321a8a335394bd8a937771bdcdb542cf96045d645ae352392528e"

RPROVIDES:${PN} += "gnome-usage"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libdazzle-1.0.so.0 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtop-2.0.so.11 \
libhandy-1.so.0 \
libpango-1.0.so.0 \
libtracker-sparql-3.0.so.0"

inherit rpm
