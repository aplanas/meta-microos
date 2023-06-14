SUMMARY = "Documentation for texlive-pdfbook2"
DESCRIPTION = "This package includes the documentation for texlive-pdfbook2"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.4svn53521"

RPM_NAME = "texlive-pdfbook2-doc-2023.201.1.4svn53521-51.1.noarch.rpm"
RPM_HASH = "474c2acfbc09335fccc1612c5435ee756f6cbe97a782a80da154308188e67b3bd747bb04c370b38f56401f1c7e3b138ea7f3aa3a23271bc1e2864a8f27b2f504"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-pdfbook2.1 \
texlive-pdfbook2-doc"

RDEPENDS:${PN} += ""

inherit rpm
