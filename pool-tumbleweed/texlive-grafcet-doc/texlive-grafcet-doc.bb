SUMMARY = "Documentation for texlive-grafcet"
DESCRIPTION = "This package includes the documentation for texlive-grafcet"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3.5svn22509"

RPM_NAME = "texlive-grafcet-doc-2023.201.1.3.5svn22509-53.2.noarch.rpm"
RPM_HASH = "0f3bdeef7ed5290e13b69f678375c8cca79dd09bbc6cd13b8a2cce9193444f62e605d49caaf6bf9121e9018c3e2bdb3c563cdfe629322243f73f2a5ddab2055c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-grafcet-doc-fr \
texlive-grafcet-doc"

RDEPENDS:${PN} += ""

inherit rpm
