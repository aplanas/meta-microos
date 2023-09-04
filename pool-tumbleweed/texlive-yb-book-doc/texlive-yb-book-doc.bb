SUMMARY = "Documentation for texlive-yb-book"
DESCRIPTION = "This package includes the documentation for texlive-yb-book"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2.0svn64586"

RPM_NAME = "texlive-yb-book-doc-2023.209.0.0.2.0svn64586-53.2.noarch.rpm"
RPM_HASH = "4a5dd10d68f9b33de5a7867179946ebe340628d5135af3da81c07bff96699af55baef893c1bb6ed9bfab60f1316b2bae54e699b4cb99e655831f723fd01b2eab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yb-book-doc"

RDEPENDS:${PN} += ""

inherit rpm
