SUMMARY = "Development files for building SPICE-server"
DESCRIPTION = "Development files for building SPICE-server. \
The SPICE server is used to expose a remote machine's display \
and devices."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "0.15.2"

RPM_NAME = "libspice-server-devel-0.15.2-1.1.aarch64.rpm"
RPM_HASH = "a1b090106702f59ae933edef7c7b32e5be71ba1ee4ec7fc1841eac9047410b2917646b113213fc42198a6da2a91ea3064cd264bd26e18e3ab6552fb173fd0d40"

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
