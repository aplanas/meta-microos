SUMMARY = "Documentation for texlive-stringstrings"
DESCRIPTION = "This package includes the documentation for texlive-stringstrings"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.24svn57097"

RPM_NAME = "texlive-stringstrings-doc-2023.201.1.24svn57097-57.1.noarch.rpm"
RPM_HASH = "f509f9ae020449ca2fe81b0d214ab966b429f628db6baa0a9608525645b1dd5ef5111d4a7c3bacfaa1c88c2b0807240124ddd312bdd56dba80de0d3ae655a7e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-stringstrings-doc"

RDEPENDS:${PN} += ""

inherit rpm
