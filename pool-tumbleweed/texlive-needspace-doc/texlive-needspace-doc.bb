SUMMARY = "Documentation for texlive-needspace"
DESCRIPTION = "This package includes the documentation for texlive-needspace"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3dsvn29601"

RPM_NAME = "texlive-needspace-doc-2023.201.1.3dsvn29601-54.1.noarch.rpm"
RPM_HASH = "bc091032b5b1a82c2e2b2293216bdadac88e78466ca299a239f13bb1e58b9354796202f0b94053b029cf8799f273904a20e41d00e33cf4679227e7dd3a7290f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-needspace-doc"

RDEPENDS:${PN} += ""

inherit rpm
