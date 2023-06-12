SUMMARY = "Documentation for texlive-beamertheme-upenn-bc"
DESCRIPTION = "This package includes the documentation for texlive-beamertheme-upenn-bc"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn29937"

RPM_NAME = "texlive-beamertheme-upenn-bc-doc-2023.201.1.0svn29937-53.1.noarch.rpm"
RPM_HASH = "f6698eb8f9fee45448c9bf0485b673c767d5eb785d601608db7b4edcecc86d6b4cbbf8402b2b5c3c8ce2e2da80104aa1a423fa618a5ab15262517e3e5d1919e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamertheme-upenn-bc-doc"
RDEPENDS:${PN} += ""

inherit rpm
