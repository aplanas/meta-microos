SUMMARY = "Development headers for coin-or-Clp"
DESCRIPTION = "Clp (Coin-or linear programming) is an open-source linear programming solver. \
 \
This package contains the development headers for coin-or-Clp."
LICENSE = "EPL-2.0"

PV = "1.17.7"

RPM_NAME = "coin-or-Clp-devel-1.17.7-1.4.aarch64.rpm"
RPM_HASH = "4918a6e395572674aa8cfea201653c50f40dc62ba8235b028df5d0420915fbacf11bedf3e339985cb792158f2bc9eb0753dc00d733599547929fb00cab6d8d97"

RPROVIDES:${PN} += "coin-or-Clp-devel \
pkgconfig-clp \
pkgconfig-osi-clp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libClp1 \
libOsiClp1 \
pkgconfig-clp \
pkgconfig-coinutils \
pkgconfig-osi"

inherit rpm
