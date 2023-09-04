SUMMARY = "Documentation for texlive-gmp"
DESCRIPTION = "This package includes the documentation for texlive-gmp"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn21691"

RPM_NAME = "texlive-gmp-doc-2023.209.1.0svn21691-54.2.noarch.rpm"
RPM_HASH = "04420ae9bd333efb288f4ff837d0c6cd3a73881534bd298a68d267dddb6fdbdb239e033f9c77f35f7173690ae1ee9bf290c5eabbc671ca369922cfc869c8a43a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gmp-doc"

RDEPENDS:${PN} += ""

inherit rpm
