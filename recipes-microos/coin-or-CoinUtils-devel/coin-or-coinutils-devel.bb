SUMMARY = "Development headers for coin-or-CoinUtils"
DESCRIPTION = "CoinUtils is an open-source collection of classes and helper functions \
that are generally useful to multiple COIN-OR projects. \
 \
This package contains the development headers for coin-or-CoinUtils."
LICENSE = "EPL-2.0"

PV = "2.11.6"

RPM_NAME = "coin-or-CoinUtils-devel-2.11.6-1.3.aarch64.rpm"
RPM_HASH = "d1a8bf0726d3bef112e4af7e9f984602f6ee27cb79e97a914b224fde43c7e341c17587e440bd6d782daf53698089c7a5405f40095dcbccdf8967eb06ba60c343"

RPROVIDES:${PN} += "coin-or-CoinUtils-devel \
coin-or-CoinUtils-devel(aarch-64) \
pkgconfig(coinutils)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libCoinUtils3"

inherit rpm
