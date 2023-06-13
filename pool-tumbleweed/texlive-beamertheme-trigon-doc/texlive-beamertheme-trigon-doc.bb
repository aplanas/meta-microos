SUMMARY = "Documentation for texlive-beamertheme-trigon"
DESCRIPTION = "This package includes the documentation for texlive-beamertheme-trigon"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7.0svn65985"

RPM_NAME = "texlive-beamertheme-trigon-doc-2023.201.0.0.7.0svn65985-53.1.noarch.rpm"
RPM_HASH = "29aeff2848df678830974ce7d2fe78c528b565b1516e7c67190781e647fbc5d341fd266a25dcfefcb114e38c7023f268f0c14902ad3f2ded6f0a7a78ec1c2bb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamertheme-trigon-doc"

RDEPENDS:${PN} += ""

inherit rpm
