SUMMARY = "Development headers for coin-or-Osi"
DESCRIPTION = "Osi (Open Solver Interface) provides an abstract base class to a generic \
linear programming (LP) solver. \
 \
This package contains the development headers for coin-or-Osi."
LICENSE = "EPL-2.0"

PV = "0.108.7"

RPM_NAME = "coin-or-Osi-devel-0.108.7-1.4.aarch64.rpm"
RPM_HASH = "ee37b3066fe8e0baaefb063f811dd4abc5030d31ac32659baa72e3e02702ae584696aeda071d571747158de99d89ed7a793077ba1f92923b7f4e37d958e6c4e1"

RPROVIDES:${PN} += "coin-or-Osi-devel \
pkgconfig-osi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libOsi1 \
pkgconfig-coinutils"

inherit rpm
