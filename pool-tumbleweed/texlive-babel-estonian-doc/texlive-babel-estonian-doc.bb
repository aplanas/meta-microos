SUMMARY = "Documentation for texlive-babel-estonian"
DESCRIPTION = "This package includes the documentation for texlive-babel-estonian"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1asvn38064"

RPM_NAME = "texlive-babel-estonian-doc-2023.209.1.1asvn38064-54.1.noarch.rpm"
RPM_HASH = "66e0bc37c85d73aa905f01a48e1fdcfe11d0d2e2e6881cebba9b23d058f4404bd6ce168db9d03f161f20697a342a6559aaae7439fa2cd9f27b1dfefc08c4a346"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-estonian-doc"

RDEPENDS:${PN} += ""

inherit rpm
