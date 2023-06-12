SUMMARY = "Documentation for texlive-showexpl"
DESCRIPTION = "This package includes the documentation for texlive-showexpl"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3ssvn57414"

RPM_NAME = "texlive-showexpl-doc-2023.201.0.0.3ssvn57414-53.1.noarch.rpm"
RPM_HASH = "a400e77876371595b8e2f1e8bed9802ee5337b40b5e88e0db5b38b7a0af45ba1f449fa27b1a5009db5d7f4c333fecd71ef91802c458e32f5840a6c832b45ddde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-showexpl-doc"
RDEPENDS:${PN} += ""

inherit rpm
