SUMMARY = "Development libraries and header files for Influx data language"
DESCRIPTION = "This package contains the header files and libraries for building \
programs using Influx data language."
LICENSE = "MIT"

PV = "0.193.0"

RPM_NAME = "libflux-devel-0.193.0-1.2.aarch64.rpm"
RPM_HASH = "cd5d41502018f3425304578d8680a199f29c1243ea5c97deaf16a02c35ac0831539d10e75dbf4e1c24c87fb4457de0605f8c02bf17b5dca47a31abe3621e458c"

RPROVIDES:${PN} += "libflux-devel \
pkgconfig-flux"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libc.so.6 \
libflux0-193-0 \
libgcc-s.so.1"

inherit rpm
