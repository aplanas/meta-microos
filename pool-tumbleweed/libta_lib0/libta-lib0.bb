SUMMARY = "Technical Analysis Library"
DESCRIPTION = " \
TA-Lib provides common functions for the technical analysis of stock/future/commodity market data."
LICENSE = "BSD-3-Clause"

PV = "0.4.0"

RPM_NAME = "libta_lib0-0.4.0-1.9.aarch64.rpm"
RPM_HASH = "65f70dd5d51b9c2c86e2ba95024d88d0da08e460ea8fe5b046ec49afb8bfb14076abe1a05f1ec258db5434f33cf4545a71914cf2e60ce4a6d4ffdeffc3ba2329"

RPROVIDES:${PN} += "libta0 \
libta_lib.so.0()(64bit) \
libta_lib0 \
libta_lib0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6()(64bit)"

inherit rpm
