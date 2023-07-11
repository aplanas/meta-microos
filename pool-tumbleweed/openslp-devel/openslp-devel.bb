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

RPM_NAME = "openslp-devel-2.0.0-21.5.aarch64.rpm"
RPM_HASH = "d2510243fdd90b000f9aa77b0da8844eb36c054d31e050e97130ea067db42c792f7472974f6e6d01ff0a8434460fffb39c910cfcee781eddd94097bfab6d176e"

RPROVIDES:${PN} += "openslp-devel"

RDEPENDS:${PN} += "libslp1 \
openssl-devel"

inherit rpm
