SUMMARY = "Development headers for coin-or-Cbc"
DESCRIPTION = "Cbc (Coin-or branch and cut) is an open-source mixed integer linear \
programming solver written in C++. \
 \
This package contains the development headers for coin-or-Cbc."
LICENSE = "EPL-2.0"

PV = "2.10.8"

RPM_NAME = "coin-or-Cbc-devel-2.10.8-1.3.aarch64.rpm"
RPM_HASH = "88969e816a0a06f19d04b5c9c0711f08521aa0a90a9e2d6b1eed11aa43fa6a85bcb9a2d7124cfc0a3b6cfc0bcec6a04c2c598bfaa117eacc5b4dc8dfe8fe29ba"

RPROVIDES:${PN} += "coin-or-Cbc-devel \
coin-or-Cbc-devel(aarch-64) \
pkgconfig(cbc) \
pkgconfig(osi-cbc)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libCbc3 \
libOsiCbc3 \
pkgconfig(cbc) \
pkgconfig(cgl) \
pkgconfig(clp) \
pkgconfig(coinutils) \
pkgconfig(osi) \
pkgconfig(osi-clp)"

inherit rpm
