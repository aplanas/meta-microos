SUMMARY = "Documentation for texlive-git-latexdiff"
DESCRIPTION = "This package includes the documentation for texlive-git-latexdiff"
LICENSE = "BSD-3-Clause"

PV = "2023.201.1.6.0svn54732"

RPM_NAME = "texlive-git-latexdiff-doc-2023.201.1.6.0svn54732-52.1.noarch.rpm"
RPM_HASH = "11b83271732bdaa63884e3dc7848fb78fd5f8b627a53db2998907d9540f0d9d3b14dec9da372fdf13c8f569ae4285a99dbf5f32932055cd6d7eeaf8f9ee33f30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-git-latexdiff.1 \
texlive-git-latexdiff-doc"

RDEPENDS:${PN} += ""

inherit rpm
