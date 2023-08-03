SUMMARY = "Documentation for texlive-newfloat"
DESCRIPTION = "This package includes the documentation for texlive-newfloat"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1lsvn52906"

RPM_NAME = "texlive-newfloat-doc-2023.209.1.1lsvn52906-55.1.noarch.rpm"
RPM_HASH = "a85e16c2595fb4a63530d2b980bbb2b5fe9739a2bc6ed5ebe7f747d7b83c13b51df86bd3a5fc0c099648436ccd5bc830b30ec598e07976e7bf13e76e3d35ab38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-newfloat-doc"

RDEPENDS:${PN} += ""

inherit rpm
