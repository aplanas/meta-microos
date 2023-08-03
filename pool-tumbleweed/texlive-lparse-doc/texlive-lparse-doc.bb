SUMMARY = "Documentation for texlive-lparse"
DESCRIPTION = "This package includes the documentation for texlive-lparse"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.0svn65693"

RPM_NAME = "texlive-lparse-doc-2023.209.0.0.1.0svn65693-55.1.noarch.rpm"
RPM_HASH = "9b1998196d4b30e88c0b8f3e7a0feeeffb9cd2861412ae669f67770eb127f64b00b53c525a71d3d69d721c378fc4910affd6c000ac0cd0ed3665dcc9ee1976e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lparse-doc"

RDEPENDS:${PN} += ""

inherit rpm
