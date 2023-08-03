SUMMARY = "Documentation for texlive-ocr-latex"
DESCRIPTION = "This package includes the documentation for texlive-ocr-latex"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-ocr-latex-doc-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "f8c7c13bc17b38da3c47cbb8cfbbe9d95b219272c212efaf9e6319c4b096f4b17ff99d2d205332ae1a3c060faa82e5bda40be64131412adf271826fb0afcc7f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ocr-latex-doc"

RDEPENDS:${PN} += ""

inherit rpm
