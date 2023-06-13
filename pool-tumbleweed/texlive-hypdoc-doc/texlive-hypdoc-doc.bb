SUMMARY = "Documentation for texlive-hypdoc"
DESCRIPTION = "This package includes the documentation for texlive-hypdoc"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.18svn65678"

RPM_NAME = "texlive-hypdoc-doc-2023.201.1.18svn65678-52.1.noarch.rpm"
RPM_HASH = "ce34a04866e0673ae8f08ff131c737b436add0c83d045ae9ea8129b049aee6dce6422387dc443a3ed4c835b1f3c7296f2b2d78a3785742d69de30941cf342cff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hypdoc-doc"

RDEPENDS:${PN} += ""

inherit rpm
