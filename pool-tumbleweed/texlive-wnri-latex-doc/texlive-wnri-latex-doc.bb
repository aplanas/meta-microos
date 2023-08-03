SUMMARY = "Documentation for texlive-wnri-latex"
DESCRIPTION = "This package includes the documentation for texlive-wnri-latex"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.0bsvn22338"

RPM_NAME = "texlive-wnri-latex-doc-2023.209.1.0bsvn22338-54.1.noarch.rpm"
RPM_HASH = "d4e875b69ed15b615f2e8405d89defad1a9057c36a93038fd253ed5d6421287bf0c10bbdea7ef7ba0b62b69a7f56bb018a2b648d6f288ded1799c28176698965"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-wnri-latex-doc"

RDEPENDS:${PN} += ""

inherit rpm
