SUMMARY = "Documentation for texlive-xetex"
DESCRIPTION = "This package includes the documentation for texlive-xetex"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn66203"

RPM_NAME = "texlive-xetex-doc-2023.209.svn66203-53.2.noarch.rpm"
RPM_HASH = "4a307ea769174831e06cdb291e89e5f83ae178d06803d913afeb132a6cca26669d21a6ecacc0a457251bd7dd1a26a7fe73cbb52bca8bfad1a27e73752eaa9135"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-xelatex-unsafe.1 \
man-xelatex.1 \
man-xetex-unsafe.1 \
man-xetex.1 \
texlive-xetex-doc"

RDEPENDS:${PN} += ""

inherit rpm
