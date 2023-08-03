SUMMARY = "Documentation for texlive-attachfile2"
DESCRIPTION = "This package includes the documentation for texlive-attachfile2"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.11svn57959"

RPM_NAME = "texlive-attachfile2-doc-2023.209.2.11svn57959-54.1.noarch.rpm"
RPM_HASH = "ac85d43b7b742458c74f4c960b1c6e6c1e9b673ce7729aa4e52f1bf5b5316ed4cf6ea8b0b6949a922e2e011afb83cd02a43584e7057e7b962438f6960e3d19c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-pdfatfi.1 \
texlive-attachfile2-doc"

RDEPENDS:${PN} += ""

inherit rpm
