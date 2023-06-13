SUMMARY = "Documentation for texlive-bengali"
DESCRIPTION = "This package includes the documentation for texlive-bengali"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn55475"

RPM_NAME = "texlive-bengali-doc-2023.201.svn55475-53.1.noarch.rpm"
RPM_HASH = "90d70bacaba0423ac1ecf1a0c47b151623e2d164c011631cd1163533da05132f50f51e6c2ffe595f8e609cd5e4fefbff8ebbd372a45338a8a2f8261bcd4fe05c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bengali-doc"

RDEPENDS:${PN} += ""

inherit rpm
