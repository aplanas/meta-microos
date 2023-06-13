SUMMARY = "Documentation for texlive-euro"
DESCRIPTION = "This package includes the documentation for texlive-euro"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn22191"

RPM_NAME = "texlive-euro-doc-2023.201.1.1svn22191-52.1.noarch.rpm"
RPM_HASH = "9b351a4b20adaf5f1961a1a81260025d41cbbcf657d30f2f495ccbfe861290148b04654dafb7949a6590b9dbb0f8175e46d779071298ebdfe907118609b3c92c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-euro-doc"

RDEPENDS:${PN} += ""

inherit rpm
