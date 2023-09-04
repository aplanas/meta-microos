SUMMARY = "Documentation for texlive-eiad-ltx"
DESCRIPTION = "This package includes the documentation for texlive-eiad-ltx"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-eiad-ltx-doc-2023.209.1.0svn15878-54.2.noarch.rpm"
RPM_HASH = "6a02a445cafd5cc38c4a2542219c92951516482431a2258bc3986bc527544d7b132e5a9e0d47706d770827d17827386ecee35711147e21884599a083251209f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eiad-ltx-doc"

RDEPENDS:${PN} += ""

inherit rpm
