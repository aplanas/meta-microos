SUMMARY = "Documentation for texlive-lm"
DESCRIPTION = "This package includes the documentation for texlive-lm"
LICENSE = "LPPL-1.3c"

PV = "2023.201.2.005svn65956"

RPM_NAME = "texlive-lm-doc-2023.201.2.005svn65956-54.1.noarch.rpm"
RPM_HASH = "7682842d760e43db3ecfa74de824e48bfb79d90c4a02c49e930e483bcae87b0b0cf86c4891fddd19941df1afc965121c77270bdc9920a2bd3d8ce8830a86f1af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lm-doc"
RDEPENDS:${PN} += ""

inherit rpm
