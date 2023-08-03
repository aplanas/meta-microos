SUMMARY = "Documentation for texlive-pdfxup"
DESCRIPTION = "This package includes the documentation for texlive-pdfxup"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.10svn59001"

RPM_NAME = "texlive-pdfxup-doc-2023.209.2.10svn59001-52.1.noarch.rpm"
RPM_HASH = "a85248dfc0ffe70869bf56671017038764fd839e1156f65ece5b7dda8dae95c04a0f45ce69948f85365365b5ee376a17aeebc1dc675c0014e42c5f9b71f377b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-pdfxup.1 \
texlive-pdfxup-doc"

RDEPENDS:${PN} += ""

inherit rpm
