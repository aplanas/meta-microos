SUMMARY = "Development tools for Log for C++"
DESCRIPTION = "The static libraries and header files needed for development with log4shib."
LICENSE = "LGPL-2.1-only"

PV = "2.0.1"

RPM_NAME = "liblog4shib-devel-2.0.1-1.10.aarch64.rpm"
RPM_HASH = "97afe0f094a6c5da68f9bb9e953991d3913042c82d9945d1a6f034ca3475303e984b6a975af969df50af2032b5ad045cdbb44d1f5e3beacc758118a46f8d0926"

RPROVIDES:${PN} += "liblog4shib-devel \
log4shib-devel \
pkgconfig-log4shib"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libboost-thread-devel \
liblog4shib2"

inherit rpm
