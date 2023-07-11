SUMMARY = "GIMP extensions for Inkscape"
DESCRIPTION = "The GIMP import and export extensions for Inkscape. \
 \
Inkscape is a vector graphics editor."
LICENSE = "GPL-3.0-only"

PV = "1.2.2"

RPM_NAME = "inkscape-extensions-gimp-1.2.2-3.3.aarch64.rpm"
RPM_HASH = "dcb0dd9393b1800134c16a661fcdfa5bd8ba19c747cf1aeaf855974d41b78aa8f3d33fe636c4e789d39163446e13f3d08eed76ece765b2e681a6411adfd00870"

RPROVIDES:${PN} += "inkscape-extensions-gimp"

RDEPENDS:${PN} += "gimp \
inkscape \
inkscape-extensions-extra"

inherit rpm
