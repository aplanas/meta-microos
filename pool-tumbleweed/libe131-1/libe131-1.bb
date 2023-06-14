SUMMARY = "A C/C++ library for the E1.31 (sACN) protocol"
DESCRIPTION = "A C/C++ library that provides an API for packet, client and server programming \
to be used for communicating with devices implementing the E1.31 (sACN) \
protocol."
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "libe131-1-1.4.0-1.10.aarch64.rpm"
RPM_HASH = "806940462d20952ca2856b7940f017aa967c863209745aede8db9aaa1df9be4f6a45f592ee5fcb004d18fe4308bb86ba8125087abfd29e6d986e257c31922aa0"

RPROVIDES:${PN} += "libe131-1 \
libe131.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
