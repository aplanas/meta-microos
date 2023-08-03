SUMMARY = "Documentation for texlive-pxtatescale"
DESCRIPTION = "This package includes the documentation for texlive-pxtatescale"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4svn63967"

RPM_NAME = "texlive-pxtatescale-doc-2023.209.0.0.4svn63967-54.1.noarch.rpm"
RPM_HASH = "aaa7118df84f86b543b0ef633dc772e1b949952e0eb08285255372196c314efa35f2ea1ebbad56dcf34e6625dc570cddb63b87ff0e06fbe6c17f826f10319e5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pxtatescale-doc"

RDEPENDS:${PN} += ""

inherit rpm
