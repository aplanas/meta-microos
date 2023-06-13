SUMMARY = "Documentation for texlive-syntaxdi"
DESCRIPTION = "This package includes the documentation for texlive-syntaxdi"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.8.2svn56685"

RPM_NAME = "texlive-syntaxdi-doc-2023.201.0.0.8.2svn56685-57.1.noarch.rpm"
RPM_HASH = "3732bb3173c2b7464c3b7a7dc8ae4e68ff7649c3ae947044283dab5c9cb0a59648a83f012f2b047424ee8d9b230f1e9402608573eca4444c8251da2756f0e9e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-syntaxdi-doc"

RDEPENDS:${PN} += ""

inherit rpm
