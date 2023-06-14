SUMMARY = "Header files for OpenSLP"
DESCRIPTION = "Service Location Protocol is an IETF standards track protocol that \
provides a framework that allows networking applications to discover \
the existence, location, and configuration of networked services in \
networks. \
 \
This package contains header and library files to compile applications \
with SLP support. It also contains developer documentation to develop \
such applications."
LICENSE = "BSD-3-Clause"

PV = "2.0.0"

RPM_NAME = "openslp-devel-2.0.0-21.4.aarch64.rpm"
RPM_HASH = "2d110ee10afc4cb3ea83a9ed587c017b005601ab022244d798850f6e6c607324f046587d5ef1ef7fe611f210f5b4a445df1807c6aeba642042d589560377e48c"

RPROVIDES:${PN} += "openslp-devel"

RDEPENDS:${PN} += "libslp1 \
openssl-devel"

inherit rpm
