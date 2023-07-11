SUMMARY = "Development files for CUDD, a package for Binary Decision Diagram manipulation"
DESCRIPTION = "CUDD is a package for the manipulation of Binary Decision Diagrams \
(BDDs), Algebraic Decision Diagrams (ADDs) and Zero-suppressed Binary \
Decision Diagrams (ZDDs). \
 \
This subpackage contains the include files and library links for \
developing against cudd's libraries."
LICENSE = "BSD-3-Clause"

PV = "3.0.0"

RPM_NAME = "cudd-devel-3.0.0-3.15.aarch64.rpm"
RPM_HASH = "60ae1bd62977cdfea252ece4490beec23d2ddcd8510fae2cc9424397be53198094886ea275ede5157b4cb192a2ba9f37c9f15106df39135fa8a74c27c3e9d905"

RPROVIDES:${PN} += "cudd-devel"

RDEPENDS:${PN} += "libcudd-3-0-0-0"

inherit rpm
