SUMMARY = "Documentation for texlive-mylatex"
DESCRIPTION = "This package includes the documentation for texlive-mylatex"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn56751"

RPM_NAME = "texlive-mylatex-doc-2023.201.svn56751-54.1.noarch.rpm"
RPM_HASH = "18ec6c04627b9c7e1d78400b4c1e1b1a664d31842568fb472879dd6ed6c6e4972d68d761d246d2cf2ea0204c666af59098467a4559f8fea0e1cef8a3dcf74f9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mylatex-doc"

RDEPENDS:${PN} += ""

inherit rpm
