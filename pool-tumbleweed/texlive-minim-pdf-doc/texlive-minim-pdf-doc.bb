SUMMARY = "Documentation for texlive-minim-pdf"
DESCRIPTION = "This package includes the documentation for texlive-minim-pdf"
LICENSE = "LPPL-1.0"

PV = "2023.209.2023_1.2svn66395"

RPM_NAME = "texlive-minim-pdf-doc-2023.209.2023_1.2svn66395-55.1.noarch.rpm"
RPM_HASH = "5922adfc919c3d6f700b8410df4bab9c93f03d3e1e14d87863bc4a6b976f3aa03bd22ae4ca9f2150af9a28868c04703719140a8c9051dafe7c03cee3c224ec21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-minim-pdf-doc"

RDEPENDS:${PN} += ""

inherit rpm
