SUMMARY = "Documentation for texlive-bondgraphs"
DESCRIPTION = "This package includes the documentation for texlive-bondgraphs"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.1svn36605"

RPM_NAME = "texlive-bondgraphs-doc-2023.209.1.0.1svn36605-53.1.noarch.rpm"
RPM_HASH = "18025c7cdbb4bd64cf949c1b7ec68392200f11220cfce3125edd500e1855899a0fb2ed292d2d811c53cd63dec09c4c74cea4ffc8ab8bbe1beed6eed15df50b05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bondgraphs-doc"

RDEPENDS:${PN} += ""

inherit rpm
