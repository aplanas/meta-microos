SUMMARY = "Documentation for texlive-numerica-tables"
DESCRIPTION = "This package includes the documentation for texlive-numerica-tables"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0.0svn61288"

RPM_NAME = "texlive-numerica-tables-doc-2023.209.2.0.0svn61288-55.1.noarch.rpm"
RPM_HASH = "efbc7b90746d9a1b266fa8377a062548b51f11502c3b2248453c2a76b7c7582e0296a0368f3e0457afa9019be5602dbcae9e887ed3cef72e26bde8d0a5313c1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-numerica-tables-doc"

RDEPENDS:${PN} += ""

inherit rpm
