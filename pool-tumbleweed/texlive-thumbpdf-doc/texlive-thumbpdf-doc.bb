SUMMARY = "Documentation for texlive-thumbpdf"
DESCRIPTION = "This package includes the documentation for texlive-thumbpdf"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.17svn62518"

RPM_NAME = "texlive-thumbpdf-doc-2023.201.3.17svn62518-54.1.noarch.rpm"
RPM_HASH = "7e25f62d1f3d4880f588c52b370c7856a1b908aae95578a0e87b56756d5935704f0d55109f6dfceafd79ae8a4643d67b44ed0ab0db62955fd874b14904e3bbee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(thumbpdf.1) \
texlive-thumbpdf-doc"

RDEPENDS:${PN} += ""

inherit rpm
