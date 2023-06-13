SUMMARY = "Documentation for texlive-babel-albanian"
DESCRIPTION = "This package includes the documentation for texlive-babel-albanian"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0dsvn57005"

RPM_NAME = "texlive-babel-albanian-doc-2023.201.1.0dsvn57005-53.1.noarch.rpm"
RPM_HASH = "1432d46f06baf1259f323ed972e0cf0699e1088e12cf2b4667a6199bb02b1d129ed4707a5425a33f162828dfc5445323c6cfe2df82750e2762ae19b8a318cb74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-albanian-doc"

RDEPENDS:${PN} += ""

inherit rpm
