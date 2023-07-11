SUMMARY = "Freecell Solver presets"
DESCRIPTION = "Command line programs which can be used to solve Freecell and other card games. \
This package contains the presets used to solve the games."
LICENSE = "MIT"

PV = "6.8.0"

RPM_NAME = "freecell-solver-presets-6.8.0-1.4.noarch.rpm"
RPM_HASH = "79a23477f123f91a32371751d57ebe1b7393c2393cb845784e7addb90c4f0381e6648f3c19d494f2dce7251801157d45de5e361f86ccb9e95bb45b65b03307ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "freecell-solver-presets"

RDEPENDS:${PN} += ""

inherit rpm
