SUMMARY = "Documentation for texlive-epstopdf"
DESCRIPTION = "This package includes the documentation for texlive-epstopdf"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.31svn66461"

RPM_NAME = "texlive-epstopdf-doc-2023.209.2.31svn66461-54.2.noarch.rpm"
RPM_HASH = "4a64cb38986fc763d884f11558c4978568d392f4302a3791ed1ecc1d0ce266df3aaaf07258a425fbc6e1e85007ebd2113e7d20d610e302733517c4a56001b81b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-epstopdf.1 \
man-repstopdf.1 \
texlive-epstopdf-doc"

RDEPENDS:${PN} += ""

inherit rpm
