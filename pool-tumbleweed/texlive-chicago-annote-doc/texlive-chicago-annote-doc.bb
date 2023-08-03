SUMMARY = "Documentation for texlive-chicago-annote"
DESCRIPTION = "This package includes the documentation for texlive-chicago-annote"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-chicago-annote-doc-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "e06f3b521c8f062d906c52fb38b26395084c2e7e309fcd91e99536c2e57bc0668f0d68222e272e12b3f8a300b5ed357bf9c532267ab7e45c340922b80edf1038"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chicago-annote-doc"

RDEPENDS:${PN} += ""

inherit rpm
