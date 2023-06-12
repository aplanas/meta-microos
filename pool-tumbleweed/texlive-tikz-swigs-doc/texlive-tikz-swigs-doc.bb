SUMMARY = "Documentation for texlive-tikz-swigs"
DESCRIPTION = "This package includes the documentation for texlive-tikz-swigs"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn59889"

RPM_NAME = "texlive-tikz-swigs-doc-2023.201.svn59889-52.1.noarch.rpm"
RPM_HASH = "6099e3546ddd3cbab3847244aa5e5fe25a8950054ae0bfa87878d6c389f409b63e4644078aa4d6fe2e7b6c5f6006a7f0ca39a9f7fad76ea6082ef701f7e68053"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-swigs-doc"
RDEPENDS:${PN} += ""

inherit rpm
