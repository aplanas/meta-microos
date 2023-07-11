SUMMARY = "Development files for Osmocom's Media Gateway Control Protocol client library"
DESCRIPTION = "Osmocom's Media Gateway Control Protocol client librarary. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmo-mgcp-client."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-or-later"

PV = "1.9.0"

RPM_NAME = "libosmo-mgcp-client-devel-1.9.0-1.11.aarch64.rpm"
RPM_HASH = "ec5f607550c46da06dc8c2811080cc89bb9032b882baff07aeff7c8ad00ae5f3078955fa6d7858960717f4f9ecf204e943da2419ffad770ed5a3252cceb9a876"

RPROVIDES:${PN} += "libosmo-mgcp-client-devel \
pkgconfig-libosmo-mgcp-client"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosmo-mgcp-client9"

inherit rpm
