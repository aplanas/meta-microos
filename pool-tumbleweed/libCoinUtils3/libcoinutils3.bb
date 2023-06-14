SUMMARY = "Shared Libraries for coin-or-CoinUtils"
DESCRIPTION = "CoinUtils is an open-source collection of classes and helper functions \
that are generally useful to multiple COIN-OR projects."
LICENSE = "EPL-2.0"

PV = "2.11.6"

RPM_NAME = "libCoinUtils3-2.11.6-1.3.aarch64.rpm"
RPM_HASH = "c9f5fd7daa9c705868ff573b70a119e39e4638749767fcbe007479662fba3df293768d5238a8118d0024087170206ed62ec6bc23aacf61f0435a7791ab63eb5e"

RPROVIDES:${PN} += "libCoinUtils.so.3 \
libCoinUtils3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
