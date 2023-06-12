SUMMARY = "Development files for the Osmocom SCCP library"
DESCRIPTION = "SCCP is a network layer protocol that provides routing, flow control, \
segmentation, connection-orientation, and error correction facilities \
in SS7 telecommunications networks. \
 \
This subpackage contains the development files for the Osmocom SCCP \
library."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.0"

RPM_NAME = "libosmo-sccp-devel-1.7.0-1.1.aarch64.rpm"
RPM_HASH = "f1399b951a41a115ecaeccb31907e9e609fedf7b01fad9e2c54b57a5e9800371f715cc1eb07f3b4b068d9b574a7a3c15a97a2486f09aae296b6d9ffa6e692d41"

RPROVIDES:${PN} += "libosmo-sccp-devel \
libosmo-sccp-devel(aarch-64) \
pkgconfig(libosmo-sccp)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosmo-sccp-1_7_0"

inherit rpm
