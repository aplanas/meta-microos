SUMMARY = "Documentation for texlive-quantumarticle"
DESCRIPTION = "This package includes the documentation for texlive-quantumarticle"
LICENSE = "LPPL-1.0"

PV = "2023.201.6.1svn65242"

RPM_NAME = "texlive-quantumarticle-doc-2023.201.6.1svn65242-53.1.noarch.rpm"
RPM_HASH = "4148e1c354ecc8233b3815c500350d534df963107932f024b5ed1a6808da712f49b1b575df73af1bb4aa7781584cb8d3f36427b3157b5c183f89372de3403c9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quantumarticle-doc"

RDEPENDS:${PN} += ""

inherit rpm
