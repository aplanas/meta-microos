SUMMARY = "Documentation for texlive-tui"
DESCRIPTION = "This package includes the documentation for texlive-tui"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.9svn27253"

RPM_NAME = "texlive-tui-doc-2023.209.1.9svn27253-53.1.noarch.rpm"
RPM_HASH = "1f6475de6bf1f2d456bec6a11158589144cb52dff14e87767131a0f96c50f11a2e3b340db31ce80bb80f08975f840a5c213e890b6ce077ef68c09d0ec34a52ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-tui-doc-en;es \
texlive-tui-doc"

RDEPENDS:${PN} += ""

inherit rpm
