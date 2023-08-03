SUMMARY = "Documentation for texlive-datetime2-french"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-french"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.03svn56393"

RPM_NAME = "texlive-datetime2-french-doc-2023.209.1.03svn56393-53.1.noarch.rpm"
RPM_HASH = "c03fb85ebbd904f8f2497620940882206ce16a55fe77f4f3615fb107cf01ed1ba3f079ced643125aa754e00a04a2bd8790cb58bcbcb2f6f9ac3480dd94105ec1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-french-doc"

RDEPENDS:${PN} += ""

inherit rpm
