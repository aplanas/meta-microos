SUMMARY = "Development headers for coin-or-CoinUtils"
DESCRIPTION = "CoinUtils is an open-source collection of classes and helper functions \
that are generally useful to multiple COIN-OR projects. \
 \
This package contains the development headers for coin-or-CoinUtils."
LICENSE = "EPL-2.0"

PV = "2.11.9"

RPM_NAME = "coin-or-CoinUtils-devel-2.11.9-1.1.aarch64.rpm"
RPM_HASH = "15bcb3afce0034d418b9dabcc5bdc958569d224fa88d97ed80ef40a2824bdc80b3c44bc054b63d19f7caf7a3ae755df9113d780f0de16495d95393d61423ddc4"

RPROVIDES:${PN} += "coin-or-CoinUtils-devel \
pkgconfig-coinutils"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libCoinUtils3"

inherit rpm
