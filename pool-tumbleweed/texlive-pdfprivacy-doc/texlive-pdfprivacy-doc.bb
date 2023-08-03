SUMMARY = "Documentation for texlive-pdfprivacy"
DESCRIPTION = "This package includes the documentation for texlive-pdfprivacy"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn45985"

RPM_NAME = "texlive-pdfprivacy-doc-2023.209.1.0svn45985-52.1.noarch.rpm"
RPM_HASH = "9a35430247caa22dabe4ed14257c26450d1e5aafa49017223501d6ee29c1079d28bb46938b73b929af633b5293ca5281171e7f5ff90f0915e0a81b14d0087221"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfprivacy-doc"

RDEPENDS:${PN} += ""

inherit rpm
