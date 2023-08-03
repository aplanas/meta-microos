SUMMARY = "Documentation for texlive-xyling"
DESCRIPTION = "This package includes the documentation for texlive-xyling"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn15878"

RPM_NAME = "texlive-xyling-doc-2023.209.1.1svn15878-53.1.noarch.rpm"
RPM_HASH = "08dbdbd41de50b8c2b91f5b9ae9a5b4b32c224f55392cd870b6ee7bf82bd7e10bd5b89180dea61fe5c90b278d560bc486c4e8911af580cb0755145086960d3b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xyling-doc-en \
texlive-xyling-doc"

RDEPENDS:${PN} += ""

inherit rpm
