SUMMARY = "Documentation for texlive-econometrics"
DESCRIPTION = "This package includes the documentation for texlive-econometrics"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn39396"

RPM_NAME = "texlive-econometrics-doc-2023.201.1.0svn39396-53.1.noarch.rpm"
RPM_HASH = "69911b4aace37ea27f807eb8bc0b57e9a603ee32276ce3dc4bb87d7631b31eccb2d256f0200494d753e428f15f54e3a8fcb26994391b886a1413fdde81070ec2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-econometrics-doc"
RDEPENDS:${PN} += ""

inherit rpm
