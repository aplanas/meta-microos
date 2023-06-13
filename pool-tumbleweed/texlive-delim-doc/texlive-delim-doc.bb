SUMMARY = "Documentation for texlive-delim"
DESCRIPTION = "This package includes the documentation for texlive-delim"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn23974"

RPM_NAME = "texlive-delim-doc-2023.201.1.0svn23974-52.1.noarch.rpm"
RPM_HASH = "ca94de28e0e2e58abd5fdeb757f54e53e07f2a4274edc73bfae3c36ab073e6707ddae370d986b7caefcae3240d31fd165ade50eba84acc31ee13c200249333cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-delim-doc"

RDEPENDS:${PN} += ""

inherit rpm
