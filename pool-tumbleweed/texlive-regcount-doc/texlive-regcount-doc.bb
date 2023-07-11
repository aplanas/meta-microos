SUMMARY = "Documentation for texlive-regcount"
DESCRIPTION = "This package includes the documentation for texlive-regcount"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn19979"

RPM_NAME = "texlive-regcount-doc-2023.201.1.0svn19979-53.2.noarch.rpm"
RPM_HASH = "7f5df9e4b54bea059ff339c84f4e2ec6c649d6632cf585ab2d005fc701b143358a981bcc000fb2b4a508c5658254a14b14027fd665e8a382777e7a6aa2c61676"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-regcount-doc"

RDEPENDS:${PN} += ""

inherit rpm
