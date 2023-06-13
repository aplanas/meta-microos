SUMMARY = "Documentation for texlive-vcell"
DESCRIPTION = "This package includes the documentation for texlive-vcell"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.2svn59039"

RPM_NAME = "texlive-vcell-doc-2023.201.1.0.2svn59039-53.1.noarch.rpm"
RPM_HASH = "ff85f808862cb9f85068b89999b4d977098abbafeac97ec783c9fbdba09e9b43479b47ba4b1ab5cbf2d589a7dadb73a5576f52558fe78fe5b2e32d70977d25d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-vcell-doc"

RDEPENDS:${PN} += ""

inherit rpm
