SUMMARY = "Development files for building SPICE-server"
DESCRIPTION = "Development files for building SPICE-server. \
The SPICE server is used to expose a remote machine's display \
and devices."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "0.15.2"

RPM_NAME = "libspice-server-devel-0.15.2-2.1.aarch64.rpm"
RPM_HASH = "9bb21655aca655ea994c53786031a130a0934cc836d1122b4ff7472fea9042f3529d27d7fdae5e5a412ff1f5d74c81e598f3afc58b5dd5c3cdcfe6e6150e9273"

RPROVIDES:${PN} += "libspice-server-devel \
pkgconfig-spice-server"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libspice-server1 \
pkgconfig-glib-2.0 \
pkgconfig-libcacard \
pkgconfig-openssl \
pkgconfig-pixman-1 \
pkgconfig-spice-protocol"

inherit rpm
