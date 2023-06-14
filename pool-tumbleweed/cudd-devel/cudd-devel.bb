SUMMARY = "Development files for CUDD, a package for Binary Decision Diagram manipulation"
DESCRIPTION = "CUDD is a package for the manipulation of Binary Decision Diagrams \
(BDDs), Algebraic Decision Diagrams (ADDs) and Zero-suppressed Binary \
Decision Diagrams (ZDDs). \
 \
This subpackage contains the include files and library links for \
developing against cudd's libraries."
LICENSE = "BSD-3-Clause"

PV = "3.0.0"

RPM_NAME = "cudd-devel-3.0.0-3.14.aarch64.rpm"
RPM_HASH = "1704bbc1b746c8987a3a22bcb8dbfcdf303eec2558f2d620437ea1f95a9d08ce2efbaf5a64df44c4c6058ec32536dc4dac8694de3770f74e99b3a61e6a51b6e9"

RPROVIDES:${PN} += "cudd-devel"

RDEPENDS:${PN} += "libcudd-3-0-0-0"

inherit rpm
