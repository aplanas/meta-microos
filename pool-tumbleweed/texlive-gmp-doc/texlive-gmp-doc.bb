SUMMARY = "Documentation for texlive-gmp"
DESCRIPTION = "This package includes the documentation for texlive-gmp"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn21691"

RPM_NAME = "texlive-gmp-doc-2023.209.1.0svn21691-54.1.noarch.rpm"
RPM_HASH = "cf6d3758c2ca35d9d031c08554374a33047db7a456aaa7c17a887ae62874d821e1a7ff23e9cf51f60cc5ac1e9e8c94e2f9eb1a6ba443a0f967853117968020da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gmp-doc"

RDEPENDS:${PN} += ""

inherit rpm
