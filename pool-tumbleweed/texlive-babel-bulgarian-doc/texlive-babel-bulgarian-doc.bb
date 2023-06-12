SUMMARY = "Documentation for texlive-babel-bulgarian"
DESCRIPTION = "This package includes the documentation for texlive-babel-bulgarian"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2gsvn31902"

RPM_NAME = "texlive-babel-bulgarian-doc-2023.201.1.2gsvn31902-53.1.noarch.rpm"
RPM_HASH = "b68d1b8a38bab0c76616dd637a61579e08a05aff8357550849807c97f0c3ad6eda1d9560dc7cff357a9541997723ca5be90687dd2d372b97b68880f1c296c992"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-bulgarian-doc"
RDEPENDS:${PN} += ""

inherit rpm
