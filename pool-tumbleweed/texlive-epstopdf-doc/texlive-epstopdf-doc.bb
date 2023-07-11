SUMMARY = "Documentation for texlive-epstopdf"
DESCRIPTION = "This package includes the documentation for texlive-epstopdf"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.31svn66461"

RPM_NAME = "texlive-epstopdf-doc-2023.201.2.31svn66461-53.2.noarch.rpm"
RPM_HASH = "0740148ce8e10cfcd9e637b8d972ba0c0910eb166523cb0303105cb3e9592a01d1682cb636e09a828b7800daa40fd0f8077b729d7af2d4f956f4437833ec400a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-epstopdf.1 \
man-repstopdf.1 \
texlive-epstopdf-doc"

RDEPENDS:${PN} += ""

inherit rpm
