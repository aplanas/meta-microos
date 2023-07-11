SUMMARY = "System resources viewer for GNOME"
DESCRIPTION = "GNOME Usage is a program to view information about the use of system \
resources, like memory and disk space."
LICENSE = "GPL-3.0-only"

PV = "3.38.1"

RPM_NAME = "gnome-usage-3.38.1-1.11.aarch64.rpm"
RPM_HASH = "b755fc5e6d9d49143ce78830ebbc0e26a752627b1927accc6ea380055c3fe1437c030a2b7995d8b6906fba5e12a8ec145fe29de78113a771f0c1de010db0c32b"

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
