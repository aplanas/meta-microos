SUMMARY = "Header files for Avahi's Glib bindings"
DESCRIPTION = "GLib support for Avahi. \
 \
Avahi is an implementation of the DNS Service Discovery and Multicast DNS \
specifications for Zeroconf Computing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "libavahi-glib-devel-0.8-23.1.aarch64.rpm"
RPM_HASH = "063cf9c6437dce02e84444179e9103f8b83181c85cd19682706b26d605eb2063846b1fa971161433684adfad9834b2088d4dca0ffe2d6cd2f3db2fdb9f9e405d"

RPROVIDES:${PN} += "avahi-devel:/usr/lib64/libavahi-glib.so \
libavahi-glib-devel \
libavahi-glib-devel(aarch-64) \
pkgconfig(avahi-glib) \
pkgconfig(avahi-ui-gtk3)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libavahi-devel \
libavahi-glib1 \
libavahi-ui-gtk3-0 \
pkgconfig(avahi-client) \
pkgconfig(avahi-glib) \
pkgconfig(glib-2.0) \
pkgconfig(gtk+-3.0) \
typelib-1_0-Avahi-0_6"

inherit rpm
