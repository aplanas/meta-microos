SUMMARY = "Documentation for texlive-scratch3"
DESCRIPTION = "This package includes the documentation for texlive-scratch3"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.19svn61921"

RPM_NAME = "texlive-scratch3-doc-2023.201.0.0.19svn61921-53.1.noarch.rpm"
RPM_HASH = "1a99dec013235fbfdd11a4c3787f892b35562bb37398997e627ff4cef7e17f1833d68dc7596d559b24159e1ac136bf489965962abf1dfc115c9fc293e8f8ff76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-scratch3-doc:fr) \
texlive-scratch3-doc"

RDEPENDS:${PN} += ""

inherit rpm
