SUMMARY = "Garbage collection library for interacting with nilfs"
DESCRIPTION = "This package contains shared garbage collection library needed for some \
applications to interface with nilfs"
LICENSE = "GPL-2.0-only"

PV = "2.2.9"

RPM_NAME = "libnilfsgc0-2.2.9-1.5.aarch64.rpm"
RPM_HASH = "5276e7aac351f07ce7a5c730d92fe0061add234d5fdecbee62925a933c5235ecec96ef6e745750621f44e270b01e25ca42171f747d85ff5c44cfce5fd7c6af34"

RPROVIDES:${PN} += "libnilfsgc.so.0 \
libnilfsgc0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnilfs.so.0"

inherit rpm
