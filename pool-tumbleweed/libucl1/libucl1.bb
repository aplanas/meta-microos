SUMMARY = "The UCL compression library"
DESCRIPTION = "This package contains a lossless data compression library written in \
ANSI C. UCL implements the NRV compression algorithms. Compared to \
LZO, decompression time is traded for compression ratio."
LICENSE = "GPL-2.0-or-later"

PV = "1.03"

RPM_NAME = "libucl1-1.03-5.4.aarch64.rpm"
RPM_HASH = "97fb5c4ad19c35e5b996b74833e9cba7a65e309631ef9a08b6e083aa0fb8457ec2b8219a01a1b6ed0d44667ca4a4aeac93cf12c6b903410e6ae868ed2e953ed4"

RPROVIDES:${PN} += "libucl.so.1 \
libucl1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
