SUMMARY = "Documentation for texlive-njurepo"
DESCRIPTION = "This package includes the documentation for texlive-njurepo"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.2svn50492"

RPM_NAME = "texlive-njurepo-doc-2023.201.1.1.2svn50492-54.1.noarch.rpm"
RPM_HASH = "8c3ca6201966e8228c387892a36e8650cdc62fb77a6b5c07cfc2dfeb961c7ab43c455fc3918fa0374c578da13e8449c19be3885bc5ac5320564d42a689e8c950"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-njurepo-doc"
RDEPENDS:${PN} += ""

inherit rpm
