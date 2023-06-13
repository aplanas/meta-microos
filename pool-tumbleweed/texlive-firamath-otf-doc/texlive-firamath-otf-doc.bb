SUMMARY = "Documentation for texlive-firamath-otf"
DESCRIPTION = "This package includes the documentation for texlive-firamath-otf"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.03asvn65561"

RPM_NAME = "texlive-firamath-otf-doc-2023.201.0.0.03asvn65561-52.1.noarch.rpm"
RPM_HASH = "8968fb07185373c044df6429ffeee93a37df43637a156a124e87ac63bcdaf4a323d915accd9b2bb21881625b4bd8a1d98815b49979c7f5dc708f2ca754a11fdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-firamath-otf-doc"

RDEPENDS:${PN} += ""

inherit rpm
