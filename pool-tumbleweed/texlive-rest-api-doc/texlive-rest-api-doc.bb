SUMMARY = "Documentation for texlive-rest-api"
DESCRIPTION = "This package includes the documentation for texlive-rest-api"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn57068"

RPM_NAME = "texlive-rest-api-doc-2023.201.1.4svn57068-53.2.noarch.rpm"
RPM_HASH = "8a3d95f84a038b7c34634a9f86d00abbcc2895e346514d4027b80eeb66131cb5f07bcd4965beebea56c65bf72f74e06d3177463e7ce4625a769197a3daab1610"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rest-api-doc"

RDEPENDS:${PN} += ""

inherit rpm
