SUMMARY = "Black Hole Solver development headers"
DESCRIPTION = "Files needed for building applications against Black Hole Solver."
LICENSE = "MIT"

PV = "1.12.0"

RPM_NAME = "black-hole-solver-devel-1.12.0-1.2.aarch64.rpm"
RPM_HASH = "9392e7a6fb6ec6aa80476c7c9ac402e6b168c9a0bd5131fd86a1d1c2120d3118ba4ac0dc0f781fefad9cb6052ef4e2cd182ceef98bca5ef9c180f19c6fc6c341"

RPROVIDES:${PN} += "black-hole-solver-devel \
black-hole-solver-devel(aarch-64) \
pkgconfig(libblack-hole-solver)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libblack_hole_solver1"

inherit rpm
