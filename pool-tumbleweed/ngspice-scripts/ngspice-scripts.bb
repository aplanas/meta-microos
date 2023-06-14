SUMMARY = "Ngspice init scripts"
DESCRIPTION = "Ngspice is a mixed-level/mixed-signal circuit simulator. Its code \
is based on three open source software packages: Spice3f5, Cider1b1 \
and Xspice. This package contains the ngspice init scripts shared \
between ngspice and libngspice."
LICENSE = "BSD-2-Clause"

PV = "40"

RPM_NAME = "ngspice-scripts-40-1.1.aarch64.rpm"
RPM_HASH = "1c9421e5916fe28e20a88cc79b670145dbc38f5b9a099c6ed18dfd5bb1cc34da13e46df1f5aafd0f142ae81ab3146b8b9429d6f6e9933e1439fa694f7ad6a99d"

RPROVIDES:${PN} += "ngspice-scripts"

RDEPENDS:${PN} += ""

inherit rpm
