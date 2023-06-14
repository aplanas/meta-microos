SUMMARY = "Simple round analog clock"
DESCRIPTION = "oclock is a simple analog clock using the SHAPE extension to make \
a round (possibly transparent) window."
LICENSE = "MIT"

PV = "1.0.5"

RPM_NAME = "oclock-1.0.5-1.2.aarch64.rpm"
RPM_HASH = "bb44aa02cff71ff145cdf0332b6bfb225705058d37e796b1f60d30772b67572a2b807b192c86e08b0713d7e9f635f2cf82b1f612b6bb156ca8329fa18e7ac816"

RPROVIDES:${PN} += "oclock"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXmu.so.6 \
libXt.so.6 \
libc.so.6 \
libm.so.6 \
libxkbfile.so.1"

inherit rpm
