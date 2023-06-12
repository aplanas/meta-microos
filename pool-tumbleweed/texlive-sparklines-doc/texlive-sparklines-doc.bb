SUMMARY = "Documentation for texlive-sparklines"
DESCRIPTION = "This package includes the documentation for texlive-sparklines"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.7svn42821"

RPM_NAME = "texlive-sparklines-doc-2023.201.1.7svn42821-57.1.noarch.rpm"
RPM_HASH = "0c89f7ab2ea7e1e920d64f465ff72f8461e2d626229eb38efb924c34c26c562e0924858f5f959cb231b3102ed35cc0f800f3f52dfbfb4339f3b9eae0a19a6331"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sparklines-doc"
RDEPENDS:${PN} += ""

inherit rpm
