SUMMARY = "Documentation for texlive-realtranspose"
DESCRIPTION = "This package includes the documentation for texlive-realtranspose"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn56623"

RPM_NAME = "texlive-realtranspose-doc-2023.201.1.1svn56623-53.2.noarch.rpm"
RPM_HASH = "40ef336846808809003732d2c001654a9d01700f589df0ef5f0a6e1bb20c3e83921125797203b32a5e1f4d52dc2b90e411d6dceb5f88511a97ebadfba58a3f98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-realtranspose-doc"

RDEPENDS:${PN} += ""

inherit rpm
