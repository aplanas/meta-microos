SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains libscotch static libraries."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-mpich-devel-static-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "b18974ff66576791d23528fbd3fa2f14dc014f0f7a7492ee91fec5588468081cf471608653a3de013a3bf270296c451ddf46b2babefadc80501e125d3f3309b1"

RPROVIDES:${PN} += "ptscotch-mpich-devel-static \
ptscotch-mpich-devel-static(aarch-64) \
scotch-devel-static"
RDEPENDS:${PN} += "ptscotch-mpich-devel"

inherit rpm
