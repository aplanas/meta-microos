SUMMARY = "Documentation for texlive-light-latex-make"
DESCRIPTION = "This package includes the documentation for texlive-light-latex-make"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2.0svn66473"

RPM_NAME = "texlive-light-latex-make-doc-2023.201.1.2.0svn66473-54.1.noarch.rpm"
RPM_HASH = "d3fc17156595896615b9245bf830d31dab6c5da2f8066d548c511dc03bc8b102688256fb43a5a62fa39d666f7715a45b1824473856d8e09633954aec522073ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-llmk.1 \
texlive-light-latex-make-doc"

RDEPENDS:${PN} += ""

inherit rpm
