SUMMARY = "Documentation for texlive-bundledoc"
DESCRIPTION = "This package includes the documentation for texlive-bundledoc"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.4svn64620"

RPM_NAME = "texlive-bundledoc-doc-2023.201.3.4svn64620-52.1.noarch.rpm"
RPM_HASH = "e88484eb9f6791387e54879b14f1fec69139d372ee59da1fdec65f874e86de98365fe53c01f4b1dac87701804d33330507e75ca04a5e29cf4d07512d947d4cdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-arlatex.1 \
man-bundledoc.1 \
texlive-bundledoc-doc"

RDEPENDS:${PN} += ""

inherit rpm
