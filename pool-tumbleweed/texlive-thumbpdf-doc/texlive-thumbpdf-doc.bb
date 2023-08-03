SUMMARY = "Documentation for texlive-thumbpdf"
DESCRIPTION = "This package includes the documentation for texlive-thumbpdf"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.17svn62518"

RPM_NAME = "texlive-thumbpdf-doc-2023.209.3.17svn62518-55.1.noarch.rpm"
RPM_HASH = "d1396800881dbc663cf0c1fa9a22b190137a85c309024709cf1834b73961fa6d17709c834d30ba8e7a6b5033f72adf654a98baf3612677e5703ff1e8fb5f2a22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-thumbpdf.1 \
texlive-thumbpdf-doc"

RDEPENDS:${PN} += ""

inherit rpm
