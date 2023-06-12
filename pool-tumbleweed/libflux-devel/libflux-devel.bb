SUMMARY = "Development libraries and header files for Influx data language"
DESCRIPTION = "This package contains the header files and libraries for building \
programs using Influx data language."
LICENSE = "MIT"

PV = "0.193.0"

RPM_NAME = "libflux-devel-0.193.0-1.1.aarch64.rpm"
RPM_HASH = "8e7b4657d9fe63bd57e6988dc537604ecd811a258bdd443eb420748f96f7d3b4d3023e130dba020b16a3933f800771595695bf5d150efb2825b6f6d45b3bcea8"

RPROVIDES:${PN} += "libflux-devel \
libflux-devel(aarch-64) \
pkgconfig(flux)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libc.so.6(GLIBC_2.34)(64bit) \
libflux0_193_0 \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit)"

inherit rpm
