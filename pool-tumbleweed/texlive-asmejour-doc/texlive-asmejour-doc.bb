SUMMARY = "Documentation for texlive-asmejour"
DESCRIPTION = "This package includes the documentation for texlive-asmejour"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.20svn65405"

RPM_NAME = "texlive-asmejour-doc-2023.201.1.20svn65405-53.1.noarch.rpm"
RPM_HASH = "6f935bdf4d0e56f553974ecf0742b716a20efe4dd8033cdf9d561c3b2a555084f4a38b2139b0c80c96bb37834e6bf0be07b06c406c6dfdf2ddd048ee762030dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-asmejour-doc"
RDEPENDS:${PN} += ""

inherit rpm
