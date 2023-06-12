SUMMARY = "Development headers for coin-or-Clp"
DESCRIPTION = "Clp (Coin-or linear programming) is an open-source linear programming solver. \
 \
This package contains the development headers for coin-or-Clp."
LICENSE = "EPL-2.0"

PV = "1.17.7"

RPM_NAME = "coin-or-Clp-devel-1.17.7-1.3.aarch64.rpm"
RPM_HASH = "0636d2e0f09ef8bcc8a98ad94c5f8bbdfd4975ede66f1b416ab6404513173af0b595487207256d8700356819aa831574d1180b6b28f7a4d59113f718b1ac27b7"

RPROVIDES:${PN} += "coin-or-Clp-devel \
coin-or-Clp-devel(aarch-64) \
pkgconfig(clp) \
pkgconfig(osi-clp)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libClp1 \
libOsiClp1 \
pkgconfig(clp) \
pkgconfig(coinutils) \
pkgconfig(osi)"

inherit rpm
