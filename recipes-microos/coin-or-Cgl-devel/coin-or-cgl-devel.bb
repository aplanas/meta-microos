SUMMARY = "Development headers for coin-or-Cgl"
DESCRIPTION = "The COIN-OR Cut Generation Library (Cgl) is a collection of cut generators. \
 \
This package contains the development headers for coin-or-Cgl."
LICENSE = "EPL-2.0"

PV = "0.60.6"

RPM_NAME = "coin-or-Cgl-devel-0.60.6-1.3.aarch64.rpm"
RPM_HASH = "ab63a05c4420cafc9efed1ca2bbae7513f3fe10127e0989a5a2f69306f69b9b6f75736e0799f23d878182d1362b760d219a35984e75e90dfb9a57bb43c99498d"

RPROVIDES:${PN} += "coin-or-Cgl-devel coin-or-Cgl-devel(aarch-64) pkgconfig(cgl)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libCgl1 pkgconfig(clp) pkgconfig(coinutils) pkgconfig(osi) pkgconfig(osi-clp)"

inherit rpm
