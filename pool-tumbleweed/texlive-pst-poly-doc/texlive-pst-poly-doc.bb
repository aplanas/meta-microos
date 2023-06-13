SUMMARY = "Documentation for texlive-pst-poly"
DESCRIPTION = "This package includes the documentation for texlive-pst-poly"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.63svn35062"

RPM_NAME = "texlive-pst-poly-doc-2023.201.1.63svn35062-53.1.noarch.rpm"
RPM_HASH = "3b3b1a822a79a11a249905b3a0842afbf8c34c493d46129c97af71d16bdaf76a455e703b2e109bf2291485bb9e67e7eb2f66744cba4b9cc3df0e6542eb863c0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-poly-doc"

RDEPENDS:${PN} += ""

inherit rpm
