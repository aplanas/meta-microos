SUMMARY = "Documentation of GNUplot"
DESCRIPTION = "GNUplot is a command line driven interactive function plotting utility. \
GNUplot supports many different types of terminals, plotters, and \
printers (including many color devices and pseudodevices like LaTeX) \
and can easily be extended to include new devices. \
 \
 \
gnuplot documentation files including the info pages."
LICENSE = "GPL-2.0-or-later & SUSE-Gnuplot"

PV = "5.4.8"

RPM_NAME = "gnuplot-doc-5.4.8-1.1.noarch.rpm"
RPM_HASH = "ec1156f11081cdcebba07b126c4ad0baf71e865e02a013ef4afe8e357e01ea2b37a2cd701b5169b92a910514ab3fb160578d385643bba50be3ddbdb7789b252a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnuplot-doc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnuplot"

inherit rpm
