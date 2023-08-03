SUMMARY = "Documentation for texlive-dejavu-otf"
DESCRIPTION = "This package includes the documentation for texlive-dejavu-otf"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.04svn45991"

RPM_NAME = "texlive-dejavu-otf-doc-2023.209.0.0.04svn45991-53.1.noarch.rpm"
RPM_HASH = "22acc4395f28b9ad2d199aa2a3a89ce36cd19b60eea36b80640cc57e15ab7b0c5753ed213911c3ccb72b31276ae196a33863560f696eb1133ca7eaee59b8fdad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dejavu-otf-doc"

RDEPENDS:${PN} += ""

inherit rpm
