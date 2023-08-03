SUMMARY = "Documentation for texlive-hopatch"
DESCRIPTION = "This package includes the documentation for texlive-hopatch"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn65491"

RPM_NAME = "texlive-hopatch-doc-2023.209.1.5svn65491-54.1.noarch.rpm"
RPM_HASH = "8d508451310683fbc7a2a07127ecfc73c93f5a8186c52b62ad680c69f5e9539c08083bad0577ddaf340bd76da23564dfb36ecc3b5ae4176ad766f260fb6b3cf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hopatch-doc"

RDEPENDS:${PN} += ""

inherit rpm
