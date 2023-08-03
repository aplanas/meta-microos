SUMMARY = "Documentation for texlive-getmap"
DESCRIPTION = "This package includes the documentation for texlive-getmap"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.11svn50589"

RPM_NAME = "texlive-getmap-doc-2023.209.1.11svn50589-53.1.noarch.rpm"
RPM_HASH = "a3cbab1411d428ebb6c6244ae6527baab641e86fb85505ca2bde246fb21707f2ca52070c666a79b63ef362e0189c335c3bf6d454666f5f783b4d7f238f63f273"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-getmap-doc"

RDEPENDS:${PN} += ""

inherit rpm
