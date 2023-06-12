SUMMARY = "Documentation for texlive-cascadilla"
DESCRIPTION = "This package includes the documentation for texlive-cascadilla"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.8.2svn25144"

RPM_NAME = "texlive-cascadilla-doc-2023.201.1.8.2svn25144-52.1.noarch.rpm"
RPM_HASH = "69ff04083c8caf60b535b7c5069b2132b83c2678d50308fff7c330017cbfb9066ae231dd8deae66b90a5eb681db6a25db1deaf8cddd3d3173bf1c7cd507e9acf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cascadilla-doc"
RDEPENDS:${PN} += ""

inherit rpm
