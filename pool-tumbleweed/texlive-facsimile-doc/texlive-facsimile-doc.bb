SUMMARY = "Documentation for texlive-facsimile"
DESCRIPTION = "This package includes the documentation for texlive-facsimile"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn21328"

RPM_NAME = "texlive-facsimile-doc-2023.209.1.0svn21328-53.1.noarch.rpm"
RPM_HASH = "4fcd6de1ce7aac0c93e93dfe7ced79f7f30c405ffae1e428cab64ccf84ca0c79c8a5d1e042ccf365c0d14e59b73537edebe4f81c110d61e48821fe75760b2f32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-facsimile-doc"

RDEPENDS:${PN} += ""

inherit rpm
