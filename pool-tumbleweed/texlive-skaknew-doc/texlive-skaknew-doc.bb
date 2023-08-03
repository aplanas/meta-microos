SUMMARY = "Documentation for texlive-skaknew"
DESCRIPTION = "This package includes the documentation for texlive-skaknew"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn20031"

RPM_NAME = "texlive-skaknew-doc-2023.209.svn20031-58.1.noarch.rpm"
RPM_HASH = "2dc5ebbaec42237089c6b9638cc892739c4c30dd002c27be7b1c9e2d3e2d4afbec35e3e459f0426da49f574b29262c6b691bbc84c2dd52c2cde86ea27b5cdffe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-skaknew-doc"

RDEPENDS:${PN} += ""

inherit rpm
