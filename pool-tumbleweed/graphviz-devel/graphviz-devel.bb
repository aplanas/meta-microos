SUMMARY = "Graphviz development package"
DESCRIPTION = "The graphviz-devel package contains all that's necessary for developing \
programs that use the graphviz libraries including man3 pages."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "graphviz-devel-2.49.3-6.4.aarch64.rpm"
RPM_HASH = "0faf626e29ca9cccb5da34e9eb6a0810de426a5e07a8908d2338ea86c232d31d641ecbce4d100b53d8ee28447b489bf7c872cf75f43907d017780d38ca4b6fbf"

RPROVIDES:${PN} += "graphviz-devel \
pkgconfig-libcdt \
pkgconfig-libcgraph \
pkgconfig-libgvc \
pkgconfig-libgvpr \
pkgconfig-liblab-gamut \
pkgconfig-libpathplan \
pkgconfig-libxdot"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
graphviz \
libcdt5 \
libcgraph6 \
libgvc6 \
libgvpr2 \
liblab-gamut1 \
libpathplan4 \
libxdot4"

inherit rpm
