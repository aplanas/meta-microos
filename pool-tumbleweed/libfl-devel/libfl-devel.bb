SUMMARY = "Development files for flex"
DESCRIPTION = "FLEX is a tool for generating scanners: programs that recognize lexical \
patterns in text. \
 \
This package contains files required to build programs with flex libraries."
LICENSE = "BSD-3-Clause"

PV = "2.6.4"

RPM_NAME = "libfl-devel-2.6.4-6.20.aarch64.rpm"
RPM_HASH = "97ec402930023b4b51b2cdd3d95612c72f013b74dd580416f77b92ea142be99e5020cb022da84070ae63c7bc5c9fc9ccdf244b0e1b4558008277755c73f1e316"

RPROVIDES:${PN} += "libfl-devel"

RDEPENDS:${PN} += "libfl2"

inherit rpm
