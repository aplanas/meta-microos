SUMMARY = "Ibverbs runtime library"
DESCRIPTION = "This package contains the ibverbs runtime library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "47.0"

RPM_NAME = "libibverbs1-47.0-2.2.aarch64.rpm"
RPM_HASH = "20e919946d137c524312c35467ac4f973d2c022ebf726b9f4dd02a00a92d216703fdd45ed907498c1671f62b1346470c72988aa9842739883f0bb4bf40de3099"

RPROVIDES:${PN} += "libibverbs.so.1 \
libibverbs1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibverbs \
libnl-3.so.200 \
libnl-route-3.so.200"

inherit rpm
