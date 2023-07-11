SUMMARY = "Development files for the Osmocom SCCP library"
DESCRIPTION = "SCCP is a network layer protocol that provides routing, flow control, \
segmentation, connection-orientation, and error correction facilities \
in SS7 telecommunications networks. \
 \
This subpackage contains the development files for the Osmocom SCCP \
library."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.0"

RPM_NAME = "libosmo-sccp-devel-1.7.0-1.2.aarch64.rpm"
RPM_HASH = "a2a2b78fb75299f7cae531cb6e2fac1d5ed255444d222575fa7a35b349d96f4c0f8612513b26d366a0419d1a15c13da5e04d833c36ee95071bb09bcce0aa763d"

RPROVIDES:${PN} += "libosmo-sccp-devel \
pkgconfig-libosmo-sccp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosmo-sccp-1-7-0"

inherit rpm
