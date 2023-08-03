SUMMARY = "Documentation for texlive-trajan"
DESCRIPTION = "This package includes the documentation for texlive-trajan"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn15878"

RPM_NAME = "texlive-trajan-doc-2023.209.1.1svn15878-53.1.noarch.rpm"
RPM_HASH = "6234836bceee397c130336e07b02e6fdcc95f2d51795e3677e9c2511313f888178271944af1fbeeb80e9171af70cc3d9558c84b7f9f0bc9d308af08e71216422"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-trajan-doc"

RDEPENDS:${PN} += ""

inherit rpm
