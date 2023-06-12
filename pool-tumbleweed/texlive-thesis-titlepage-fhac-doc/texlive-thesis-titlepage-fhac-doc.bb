SUMMARY = "Documentation for texlive-thesis-titlepage-fhac"
DESCRIPTION = "This package includes the documentation for texlive-thesis-titlepage-fhac"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn15878"

RPM_NAME = "texlive-thesis-titlepage-fhac-doc-2023.201.0.0.1svn15878-54.1.noarch.rpm"
RPM_HASH = "1842a21cb854a558557b0ac3d9e1115e2c134cb8c69bd9e4b94064bbe2d34ceeba963c394975b82bc5b041ee7c1292dd600a386fd14c159254c60d93a67fc8e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-thesis-titlepage-fhac-doc"
RDEPENDS:${PN} += ""

inherit rpm
