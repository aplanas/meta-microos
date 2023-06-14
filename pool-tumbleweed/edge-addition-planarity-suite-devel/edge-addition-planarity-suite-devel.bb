SUMMARY = "Development files for the Edge Addition Planarity suite"
DESCRIPTION = "EAPS provides implementations of the edge addition planar \
graph embedding algorithm and related algorithms \
 \
This subpackage provides the development headers for it."
LICENSE = "GPL-3.0-or-later"

PV = "3.0.2.0"

RPM_NAME = "edge-addition-planarity-suite-devel-3.0.2.0-1.2.aarch64.rpm"
RPM_HASH = "94a535432474879bbf88511782ea7fd2941f988613313208d4c85889667a6fdbef0bbc8b244364a7d39698792a68114adbddcf7fed1f83bc9f84c6d74ed05615"

RPROVIDES:${PN} += "edge-addition-planarity-suite-devel"

RDEPENDS:${PN} += "libplanarity0"

inherit rpm
