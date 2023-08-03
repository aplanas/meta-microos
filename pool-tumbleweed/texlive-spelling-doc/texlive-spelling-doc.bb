SUMMARY = "Documentation for texlive-spelling"
DESCRIPTION = "This package includes the documentation for texlive-spelling"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.41svn30715"

RPM_NAME = "texlive-spelling-doc-2023.209.0.0.41svn30715-58.1.noarch.rpm"
RPM_HASH = "ca234664f06eb17c1155762baabd4231a9490868e50639210ac3c9bd8e0df56e5abfd455cba964f5b82cc06322ba33663536edfe1452253bb93b3e0808f55887"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-spelling-doc"

RDEPENDS:${PN} += ""

inherit rpm
