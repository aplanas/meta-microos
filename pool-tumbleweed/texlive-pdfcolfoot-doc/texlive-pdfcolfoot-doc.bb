SUMMARY = "Documentation for texlive-pdfcolfoot"
DESCRIPTION = "This package includes the documentation for texlive-pdfcolfoot"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn65512"

RPM_NAME = "texlive-pdfcolfoot-doc-2023.201.1.4svn65512-51.1.noarch.rpm"
RPM_HASH = "0c4482321e5450e7fc8716f7e50d48ecbd7d6cbac6c80a2c2cfb9aed5c84f40666fd2e87dc41d4eb99b284cb875e1a52883e65b1eae4463e7fe1603a6f67bcb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfcolfoot-doc"
RDEPENDS:${PN} += ""

inherit rpm
