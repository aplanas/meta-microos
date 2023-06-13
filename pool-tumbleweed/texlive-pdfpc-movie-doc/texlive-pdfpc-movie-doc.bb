SUMMARY = "Documentation for texlive-pdfpc-movie"
DESCRIPTION = "This package includes the documentation for texlive-pdfpc-movie"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn48245"

RPM_NAME = "texlive-pdfpc-movie-doc-2023.201.1.0svn48245-51.1.noarch.rpm"
RPM_HASH = "43d5b7b51ca402c10efbbe085ffa98244f815a4e3ed8d77872e96d9b7cfb9fe267cdc49fc2933f7e81ca0e8acc173a1492e605509cbee4d450437867e4267cb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfpc-movie-doc"

RDEPENDS:${PN} += ""

inherit rpm
