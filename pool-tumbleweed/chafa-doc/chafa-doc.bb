SUMMARY = "Chafa documentation"
DESCRIPTION = "Documentation for chafa."
LICENSE = "LGPL-3.0-or-later"

PV = "1.12.5"

RPM_NAME = "chafa-doc-1.12.5-1.1.noarch.rpm"
RPM_HASH = "7862c4f9f0be9fdb7438708bc2465610d3cacaa7438b3051e1ed81939f1ccdaaef2cea43609fcabc7598a3eb831cbeff68ff6504ddb72aa32bfd83e18c2a7848"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "chafa-doc"

RDEPENDS:${PN} += ""

inherit rpm
