SUMMARY = "Documentation for the BIRD Internet Routing Daemon"
DESCRIPTION = "BIRD is an implementation for routing Internet Protocol packets. \
 \
This package holds the HTML documentation."
LICENSE = "GPL-2.0-or-later"

PV = "2.13.1"

RPM_NAME = "bird-doc-2.13.1-1.1.aarch64.rpm"
RPM_HASH = "a20efd816f1c677f69697342c29feb1102676cd45bdd51332f93611c995342a5a7065c784d2e0717afe621f10f1de7092c81301820b2f66f2f4ffbf03dd26124"

RPROVIDES:${PN} += "bird-doc"

RDEPENDS:${PN} += ""

inherit rpm
