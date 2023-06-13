SUMMARY = "Documentation for texlive-repltext"
DESCRIPTION = "This package includes the documentation for texlive-repltext"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn56433"

RPM_NAME = "texlive-repltext-doc-2023.201.1.1svn56433-53.1.noarch.rpm"
RPM_HASH = "131ed5853a01cad556c9bb24c6ad8f3299659fd3743c66932f78ab08ba7fb10c110c4dd279addd40e9b46ccda09abcac96f81de9b91bdc1c31e53f2b09cc9f87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-repltext-doc"

RDEPENDS:${PN} += ""

inherit rpm
