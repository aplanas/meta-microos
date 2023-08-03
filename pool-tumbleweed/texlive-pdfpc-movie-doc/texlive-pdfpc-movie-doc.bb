SUMMARY = "Documentation for texlive-pdfpc-movie"
DESCRIPTION = "This package includes the documentation for texlive-pdfpc-movie"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn48245"

RPM_NAME = "texlive-pdfpc-movie-doc-2023.209.1.0svn48245-52.1.noarch.rpm"
RPM_HASH = "2713b80eb4e1c9ec94f4b0422ffbbbd780da0fde184994b3d7f9c27ff77755a9685fd8d3e0acab5dcd40be3a1fb03f164e8fb01b0e15ff7492ba00199af3219f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfpc-movie-doc"

RDEPENDS:${PN} += ""

inherit rpm
