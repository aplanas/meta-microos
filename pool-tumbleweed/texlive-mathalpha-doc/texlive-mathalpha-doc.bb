SUMMARY = "Documentation for texlive-mathalpha"
DESCRIPTION = "This package includes the documentation for texlive-mathalpha"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.143svn61089"

RPM_NAME = "texlive-mathalpha-doc-2023.208.1.143svn61089-53.1.noarch.rpm"
RPM_HASH = "a10d85e52af25d6091502643cf608283497652f0978f020d733cbdeb7cc7ba00e1c180435c5c5dd0a69a7151bdc3fd4b1f790afa290683ced72ce8483e65079a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mathalpha-doc"

RDEPENDS:${PN} += ""

inherit rpm
