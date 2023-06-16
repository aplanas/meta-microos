SUMMARY = "Tcl Standard Library"
DESCRIPTION = "This package is intended to be a collection of Tcl packages that \
provide utility functions useful to a large collection of Tcl \
programmers."
LICENSE = "TCL"

PV = "1.21"

RPM_NAME = "tcllib-1.21-1.2.noarch.rpm"
RPM_HASH = "fb793743fec3fbf1b00d5ab9a60e108a3d8ce3d1b2ec7bb310b95f8580c7c5df46a6ba94c7faeff98dc5680fc7a83dcb29240772b624473b84e77be52e5cf2d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tcllib"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/tclsh"

inherit rpm
