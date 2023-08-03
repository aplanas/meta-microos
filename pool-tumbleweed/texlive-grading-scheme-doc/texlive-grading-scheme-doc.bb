SUMMARY = "Documentation for texlive-grading-scheme"
DESCRIPTION = "This package includes the documentation for texlive-grading-scheme"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.1svn62505"

RPM_NAME = "texlive-grading-scheme-doc-2023.209.0.0.1.1svn62505-54.1.noarch.rpm"
RPM_HASH = "150c0e025a0ba78aa66f98df2fe7252712e6a285b799b75003eff9f57cd5817d5334abb2f27ace9f6a685e0a59d2a493a9423efc7f2972691d3266410cb9b078"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-grading-scheme-doc"

RDEPENDS:${PN} += ""

inherit rpm
