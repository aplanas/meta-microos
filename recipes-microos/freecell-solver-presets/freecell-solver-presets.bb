SUMMARY = "Freecell Solver presets"
DESCRIPTION = "Command line programs which can be used to solve Freecell and other card games. \
This package contains the presets used to solve the games."
LICENSE = "MIT"

PV = "6.8.0"

RPM_NAME = "freecell-solver-presets-6.8.0-1.3.noarch.rpm"
RPM_HASH = "53b467b0ac9801734a551d1940e3e6dc1e1648a2f0dcf90254e12b913d2601778f3beec3beceaf3246e678eee2936d01028b9c219ec25ec39e6b6b460193c5d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "freecell-solver-presets"
RDEPENDS:${PN} += ""

inherit rpm
