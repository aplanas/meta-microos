SUMMARY = "Documentation for texlive-numberedblock"
DESCRIPTION = "This package includes the documentation for texlive-numberedblock"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.10svn33109"

RPM_NAME = "texlive-numberedblock-doc-2023.201.1.10svn33109-54.1.noarch.rpm"
RPM_HASH = "96e43c607c65c0ffc091659fcbd3244311f9851249652455c2f4a054a2a9d3c60a577260773b0440adf294454f5c3af144826d99cd9329f6db286992a1a9d0fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-numberedblock-doc"
RDEPENDS:${PN} += ""

inherit rpm
