SUMMARY = "Documentation for texlive-zxjafbfont"
DESCRIPTION = "This package includes the documentation for texlive-zxjafbfont"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn28539"

RPM_NAME = "texlive-zxjafbfont-doc-2023.201.0.0.2svn28539-52.2.noarch.rpm"
RPM_HASH = "9c5de1e5b10b70300f2947271345595e0d221cfc95f55bfe3dd53071c516e625f57f6e3fb620366a71c3ecb6e2b4a325383a6b3ffbf6fe6f5c8be2b8e3d51cc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zxjafbfont-doc"

RDEPENDS:${PN} += ""

inherit rpm
