SUMMARY = "Development files for building SPICE-server"
DESCRIPTION = "Development files for building SPICE-server. \
The SPICE server is used to expose a remote machine's display \
and devices."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "0.15.1"

RPM_NAME = "libspice-server-devel-0.15.1-1.4.aarch64.rpm"
RPM_HASH = "50327e6ff0e9d64051433c94b36ae5935b6dab43a74deda826e5bf0464b50b0aae713fce06088d4f0741e03c502a688e10275f24c579ff7e99556bf2d234da48"

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
