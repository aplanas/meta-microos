SUMMARY = "Documentation for texlive-tagpair"
DESCRIPTION = "This package includes the documentation for texlive-tagpair"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn42138"

RPM_NAME = "texlive-tagpair-doc-2023.209.1.1svn42138-55.1.noarch.rpm"
RPM_HASH = "4bdd1677a4b27af73df259213eb5f1afb92045e25c44072b492e0411a025c81d0f93adda61e884519028901a99ab8ea7d2c2ddfbbfa0df1e28b0aaaa8d3f6620"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tagpair-doc"

RDEPENDS:${PN} += ""

inherit rpm
