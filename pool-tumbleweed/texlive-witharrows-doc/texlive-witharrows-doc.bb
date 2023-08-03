SUMMARY = "Documentation for texlive-witharrows"
DESCRIPTION = "This package includes the documentation for texlive-witharrows"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.8asvn65841"

RPM_NAME = "texlive-witharrows-doc-2023.209.2.8asvn65841-54.1.noarch.rpm"
RPM_HASH = "5a8b63952803e9bbae23f52478a8388cd1b942b35543de1519dbe2be96e12e8bea52e44f222b26e2538c598a66d80c94e7236c5fc7abbfbc925ba45d9f903e2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-witharrows-doc-fr \
texlive-witharrows-doc"

RDEPENDS:${PN} += ""

inherit rpm
