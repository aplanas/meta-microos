SUMMARY = "Documentation for texlive-lgrmath"
DESCRIPTION = "This package includes the documentation for texlive-lgrmath"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn65038"

RPM_NAME = "texlive-lgrmath-doc-2023.201.1.0svn65038-54.1.noarch.rpm"
RPM_HASH = "e30461994e0e0d557eed809bc4a6bb990b06163fb1bf6111b9fdaa1caabf07cc711ba63e46a277afff1798feeda3d5033340b86bfc3c8aac953b3aad6e3ca5c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lgrmath-doc"
RDEPENDS:${PN} += ""

inherit rpm
