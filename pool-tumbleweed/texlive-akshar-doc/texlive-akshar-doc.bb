SUMMARY = "Documentation for texlive-akshar"
DESCRIPTION = "This package includes the documentation for texlive-akshar"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn56277"

RPM_NAME = "texlive-akshar-doc-2023.201.0.0.2svn56277-54.1.noarch.rpm"
RPM_HASH = "36fcc6c4e2a73fe2646e7babc490d2f92815e1eedbac01327ac9bd34a9ec9fc03ebf9b90aeda80662a1cf62fbc0ff5532be9557965e51adf92ee347f550f8dfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-akshar-doc"
RDEPENDS:${PN} += ""

inherit rpm
