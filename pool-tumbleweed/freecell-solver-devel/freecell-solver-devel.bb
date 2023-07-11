SUMMARY = "Freecell Solver development package"
DESCRIPTION = "Development package for the libfreecell-solver library"
LICENSE = "MIT"

PV = "6.8.0"

RPM_NAME = "freecell-solver-devel-6.8.0-1.4.aarch64.rpm"
RPM_HASH = "43857b948afed53db91b78e6ab7c7e17e3e28abc246f663475123d6dd8fad9d2555e0f146c01f9644e5640627020e0e6004a9d3ffa7f050a929885722d688aa1"

RPROVIDES:${PN} += "freecell-solver-devel \
pkgconfig-libfreecell-solver"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfreecell-solver0"

inherit rpm
