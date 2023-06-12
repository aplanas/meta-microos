SUMMARY = "Documentation for texlive-facsimile"
DESCRIPTION = "This package includes the documentation for texlive-facsimile"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn21328"

RPM_NAME = "texlive-facsimile-doc-2023.201.1.0svn21328-52.1.noarch.rpm"
RPM_HASH = "62617e8f45dfbe9e13d055b8e63952272541879e908bcb072bd5ad97bc15419f0a6423240c7e6644243f44d41c14905d37aedcc52acc90db5e939770daad2e35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-facsimile-doc"
RDEPENDS:${PN} += ""

inherit rpm
