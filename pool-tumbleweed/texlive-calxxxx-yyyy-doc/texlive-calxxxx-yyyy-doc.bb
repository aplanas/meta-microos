SUMMARY = "Documentation for texlive-calxxxx-yyyy"
DESCRIPTION = "This package includes the documentation for texlive-calxxxx-yyyy"
LICENSE = "LPPL-1.0"

PV = "2023.209.20.23asvn65426"

RPM_NAME = "texlive-calxxxx-yyyy-doc-2023.209.20.23asvn65426-53.1.noarch.rpm"
RPM_HASH = "a29db782537d4bb02a2984b2bd14957029f4bf3d20352e34055aeaa8654c2d8d4b378c764865a7ad1de0ac54c761748f884d683cc4939441dfe39ef5899d45c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-calxxxx-yyyy-doc"

RDEPENDS:${PN} += ""

inherit rpm
