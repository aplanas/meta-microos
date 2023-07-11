SUMMARY = "Documentation for texlive-eledmac"
DESCRIPTION = "This package includes the documentation for texlive-eledmac"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.24.12svn45418"

RPM_NAME = "texlive-eledmac-doc-2023.201.1.24.12svn45418-53.2.noarch.rpm"
RPM_HASH = "a8871dea98ccf80f709b70dc1f7a5514a6f855094292f2287ce6ef33d9e64ba8a2466fe015ba5b4ecf49668e9bff0c49efd920b8bac121087725ebf6953ff27e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eledmac-doc"

RDEPENDS:${PN} += ""

inherit rpm
