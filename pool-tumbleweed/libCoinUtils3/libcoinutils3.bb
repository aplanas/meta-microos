SUMMARY = "Shared Libraries for coin-or-CoinUtils"
DESCRIPTION = "CoinUtils is an open-source collection of classes and helper functions \
that are generally useful to multiple COIN-OR projects."
LICENSE = "EPL-2.0"

PV = "2.11.9"

RPM_NAME = "libCoinUtils3-2.11.9-1.1.aarch64.rpm"
RPM_HASH = "ba7014d9ea62d7d886fdb384e6ed74773d1161de807d52a68ea9bfba1418f63f0b02ded059287e9ebb1e54f2e97a32cfda4a87cde4b9e947396c013fe0e59e50"

RPROVIDES:${PN} += "libCoinUtils.so.3 \
libCoinUtils3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
