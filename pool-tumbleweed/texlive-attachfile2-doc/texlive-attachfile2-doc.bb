SUMMARY = "Documentation for texlive-attachfile2"
DESCRIPTION = "This package includes the documentation for texlive-attachfile2"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.11svn57959"

RPM_NAME = "texlive-attachfile2-doc-2023.201.2.11svn57959-53.1.noarch.rpm"
RPM_HASH = "479aa1f3da95824d83457c8d9cd0176234bc978c6b05c649284eb098e00821c6c524f4695b406b30ea37d36917e33c74d193272e30387d77c405ba2f11c39914"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-pdfatfi.1 \
texlive-attachfile2-doc"

RDEPENDS:${PN} += ""

inherit rpm
