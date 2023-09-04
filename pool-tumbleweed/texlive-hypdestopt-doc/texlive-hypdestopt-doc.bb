SUMMARY = "Documentation for texlive-hypdestopt"
DESCRIPTION = "This package includes the documentation for texlive-hypdestopt"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.7svn56253"

RPM_NAME = "texlive-hypdestopt-doc-2023.209.2.7svn56253-54.1.noarch.rpm"
RPM_HASH = "1e7b155f2d595f7c012ff46cc920fc7046b6eb44eee601ad7041dd52cb880a6c8033febf67beb7297008cc477a89008f51bb294ed4f7ea0acefa87d93a74d869"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hypdestopt-doc-en \
texlive-hypdestopt-doc"

RDEPENDS:${PN} += ""

inherit rpm
