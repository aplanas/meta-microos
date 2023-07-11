SUMMARY = "Development headers for coin-or-CoinUtils"
DESCRIPTION = "CoinUtils is an open-source collection of classes and helper functions \
that are generally useful to multiple COIN-OR projects. \
 \
This package contains the development headers for coin-or-CoinUtils."
LICENSE = "EPL-2.0"

PV = "2.11.6"

RPM_NAME = "coin-or-CoinUtils-devel-2.11.6-1.4.aarch64.rpm"
RPM_HASH = "c212435e708226ba5e1613fb7b2b52be2bb70d6684955174fbb34863b54784c7ce7bf03c953ef5a1e246b0eb79f8407f26689796295b10fd527898e8bea11e56"

RPROVIDES:${PN} += "coin-or-CoinUtils-devel \
pkgconfig-coinutils"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libCoinUtils3"

inherit rpm
