SUMMARY = "Documentation for texlive-makeplot"
DESCRIPTION = "This package includes the documentation for texlive-makeplot"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.0.6svn15878"

RPM_NAME = "texlive-makeplot-doc-2023.208.1.0.6svn15878-53.1.noarch.rpm"
RPM_HASH = "56073f3958d99258fc416e1296ab1aa23ddc1886720936e9847ab22254e4ee159c58f1acbc72786d349d79919d05f2681af67db25779f2f3048f982038c2aa9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-makeplot-doc"

RDEPENDS:${PN} += ""

inherit rpm
