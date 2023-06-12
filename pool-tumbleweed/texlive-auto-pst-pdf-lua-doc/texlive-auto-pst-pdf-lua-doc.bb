SUMMARY = "Documentation for texlive-auto-pst-pdf-lua"
DESCRIPTION = "This package includes the documentation for texlive-auto-pst-pdf-lua"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.03svn54779"

RPM_NAME = "texlive-auto-pst-pdf-lua-doc-2023.201.0.0.03svn54779-53.1.noarch.rpm"
RPM_HASH = "6960a1a4e626adafe5fcc5cfaf0516195de38ebc4df796e216044a52267ca3fbe8bee2bda790e339e74ebed3fdf66db6923563041c1fc80e6fc8b1ca1926cfb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-auto-pst-pdf-lua-doc"
RDEPENDS:${PN} += ""

inherit rpm
