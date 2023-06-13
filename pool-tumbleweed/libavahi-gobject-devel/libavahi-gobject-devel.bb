SUMMARY = "Header files for Avahi's GObject bindings"
DESCRIPTION = "Avahi is an implementation of the DNS Service Discovery and Multicast \
DNS specifications for Zeroconf Computing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "libavahi-gobject-devel-0.8-23.1.aarch64.rpm"
RPM_HASH = "9987f321061bebd620b11f0cab476f469097d3d67c0d943c912bf427daaad85eb3eae8f46d8f7e3d935baa240d69d297eebca44a4a72937d433f8969a1d7bce4"

RPROVIDES:${PN} += "libavahi-gobject-devel \
libavahi-gobject-devel(aarch-64) \
pkgconfig(avahi-gobject)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glib2-devel \
libavahi-devel \
libavahi-glib-devel \
libavahi-gobject0 \
pkgconfig(avahi-client) \
pkgconfig(avahi-glib) \
pkgconfig(glib-2.0) \
pkgconfig(gobject-2.0)"

inherit rpm
