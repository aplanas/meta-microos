SUMMARY = "Polish ispell dictionary"
DESCRIPTION = "This package includes a ready Polish dictionary for ispell. A short \
usage description is given in /usr/share/doc/packages/ispell/README of \
the package ispell. The sources for this dictionary are included in \
the package dicts."
LICENSE = "CC-BY-SA-1.0 & GPL-2.0-only & LGPL-2.1-only & MPL-1.1"

PV = "1.5"

RPM_NAME = "ispell-polish-1.5-422.6.aarch64.rpm"
RPM_HASH = "4c18303b0cb3d284962e44f1bf36c30216fd1507e1d1c87be0a4a2e1a53d3d2dcfd348c642316e3d8f6942796d00a65b9059477e848a0dd58e624e1e198468ea"

RPROVIDES:${PN} += "ipolish \
ispell-polish \
ispell-polish(aarch-64) \
ispell_dictionary \
locale(ispell:pl)"
RDEPENDS:${PN} += ""

inherit rpm
