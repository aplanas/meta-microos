SUMMARY = "Documentation for texlive-bagpipe"
DESCRIPTION = "This package includes the documentation for texlive-bagpipe"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.02svn34393"

RPM_NAME = "texlive-bagpipe-doc-2023.209.3.02svn34393-54.1.noarch.rpm"
RPM_HASH = "520f78c33f38a5183b76c62558d5cb05d5938febbe124c90bb89f883cd52dbdcb0853fbd1ad4ce30ab6f6cde7aad8dbcbc007fc65fa2553d42435e55c21e8698"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bagpipe-doc"

RDEPENDS:${PN} += ""

inherit rpm
