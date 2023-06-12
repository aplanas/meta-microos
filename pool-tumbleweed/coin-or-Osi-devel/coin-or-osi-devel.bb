SUMMARY = "Development headers for coin-or-Osi"
DESCRIPTION = "Osi (Open Solver Interface) provides an abstract base class to a generic \
linear programming (LP) solver. \
 \
This package contains the development headers for coin-or-Osi."
LICENSE = "EPL-2.0"

PV = "0.108.7"

RPM_NAME = "coin-or-Osi-devel-0.108.7-1.3.aarch64.rpm"
RPM_HASH = "6d916e2689539751491cf382e5b38bf72977b03a7a38607362c1f275a9849e33e384393b6863587572c5e159ff18a94d89fb0cfacebacc0994735102d1229a8f"

RPROVIDES:${PN} += "coin-or-Osi-devel \
coin-or-Osi-devel(aarch-64) \
pkgconfig(osi)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libOsi1 \
pkgconfig(coinutils)"

inherit rpm
