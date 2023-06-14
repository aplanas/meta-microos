SUMMARY = "Print Server"
DESCRIPTION = "The 32bit pattern complementing printing."
LICENSE = "MIT"

PV = "20210330"

RPM_NAME = "patterns-server-printing-32bit-20210330-5.1.aarch64.rpm"
RPM_HASH = "4db33a98baff83617159dae93b769165152d3cd729653eaafdcf6969156ce020f5ab4fd9e8e7ba4d758420cbcdb91ace569e9f5eec90766404a144bc98aaac30"

RPROVIDES:${PN} += "pattern- \
patterns-server-printing-32bit"

RDEPENDS:${PN} += ""

inherit rpm
