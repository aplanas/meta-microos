SUMMARY = "Documentation for texlive-spbmark"
DESCRIPTION = "This package includes the documentation for texlive-spbmark"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.42svn64706"

RPM_NAME = "texlive-spbmark-doc-2023.201.1.42svn64706-57.1.noarch.rpm"
RPM_HASH = "d9ba0a3c4f32c6997305e05e0eba3d777fffc40a39199e49bc1727b1fe1bec1d5c1311e5afcaf8a799340b7e4995a226fc40eeb2727fcc11408b4a8a87aac88b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-spbmark-doc"
RDEPENDS:${PN} += ""

inherit rpm
