SUMMARY = "Documentation for texlive-pdfbook2"
DESCRIPTION = "This package includes the documentation for texlive-pdfbook2"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.4svn53521"

RPM_NAME = "texlive-pdfbook2-doc-2023.209.1.4svn53521-52.1.noarch.rpm"
RPM_HASH = "3dee2e1de18300613a77da77b66a8486ebf7f6350d9317cf68586d7771645fe362bd629c08aeb5599e6f18c45b4e25d3c34350d9f33b9b1bdf9b9778e3ae2275"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-pdfbook2.1 \
texlive-pdfbook2-doc"

RDEPENDS:${PN} += ""

inherit rpm
