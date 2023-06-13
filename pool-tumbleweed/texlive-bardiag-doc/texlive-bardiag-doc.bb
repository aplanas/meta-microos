SUMMARY = "Documentation for texlive-bardiag"
DESCRIPTION = "This package includes the documentation for texlive-bardiag"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4asvn22013"

RPM_NAME = "texlive-bardiag-doc-2023.201.0.0.4asvn22013-53.1.noarch.rpm"
RPM_HASH = "9947be67ccede1880e4927e66cc95aceac852ef1b9048047c664005010cdabace521e0a1b52e6c017368da277917eb7b8446655ad285def46a722c0425eb5f61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bardiag-doc"

RDEPENDS:${PN} += "/bin/bash"

inherit rpm
