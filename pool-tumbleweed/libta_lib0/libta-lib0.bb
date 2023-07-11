SUMMARY = "Technical Analysis Library"
DESCRIPTION = " \
TA-Lib provides common functions for the technical analysis of stock/future/commodity market data."
LICENSE = "BSD-3-Clause"

PV = "0.4.0"

RPM_NAME = "libta_lib0-0.4.0-1.10.aarch64.rpm"
RPM_HASH = "af8d40a2f23b72245df4ed089862b34302e937466de86cb2b85c785ff761d8b85814aba69d5980f737ada433ffc6d9a59c46375f2dbbac284fa53098dee8aef2"

RPROVIDES:${PN} += "libta-lib.so.0 \
libta-lib0 \
libta0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
