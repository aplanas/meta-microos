SUMMARY = "Documentation for texlive-fouridx"
DESCRIPTION = "This package includes the documentation for texlive-fouridx"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.00svn32214"

RPM_NAME = "texlive-fouridx-doc-2023.209.2.00svn32214-53.1.noarch.rpm"
RPM_HASH = "3d7842f8f61ae512f86d71a835ee551f616f040cbd80c27744be6e9b1db66a7ddddff7ab04e4d20acd25d95e249ac4b488a202ec2460ba9dc25ab03516dc0f56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fouridx-doc"

RDEPENDS:${PN} += ""

inherit rpm
