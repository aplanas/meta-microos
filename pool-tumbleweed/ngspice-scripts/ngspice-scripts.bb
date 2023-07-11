SUMMARY = "Ngspice init scripts"
DESCRIPTION = "Ngspice is a mixed-level/mixed-signal circuit simulator. Its code \
is based on three open source software packages: Spice3f5, Cider1b1 \
and Xspice. This package contains the ngspice init scripts shared \
between ngspice and libngspice."
LICENSE = "BSD-2-Clause"

PV = "40"

RPM_NAME = "ngspice-scripts-40-1.2.aarch64.rpm"
RPM_HASH = "3d80733eff8bf72e87084f48a79626188a3d794b13a23fd1fbfa7ddb6be87968819d6994d9813c64ca830afc11fd968ff44c0049a9bd4221882603d7764eb85d"

RPROVIDES:${PN} += "ngspice-scripts"

RDEPENDS:${PN} += ""

inherit rpm
