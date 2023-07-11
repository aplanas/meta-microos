SUMMARY = "OFX Command Parser and API"
DESCRIPTION = "LibOFX is a parser and API for applications to support \
OFX command responses, usually provided by financial institutions for \
statement downloads."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.5"

RPM_NAME = "libofx7-0.10.5-1.7.aarch64.rpm"
RPM_HASH = "420777195ec8895259101a00b069cb9126dfbc6b65b94a0d3af10c63d492c25a535d490c386e4d5cb5be77297eecb0b2680cffda03bc1737d125034ad4ff1376"

RPROVIDES:${PN} += "libofx.so.7 \
libofx7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libofx \
libosp.so.5 \
libstdc++.so.6"

inherit rpm
