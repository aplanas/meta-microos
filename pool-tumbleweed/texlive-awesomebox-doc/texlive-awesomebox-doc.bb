SUMMARY = "Documentation for texlive-awesomebox"
DESCRIPTION = "This package includes the documentation for texlive-awesomebox"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.6svn57349"

RPM_NAME = "texlive-awesomebox-doc-2023.201.0.0.6svn57349-53.1.noarch.rpm"
RPM_HASH = "848d517f9f93cd8c9723e1199639a6b07359a7e294ec0c21a09b26012d54a5b0f42354cc5ce1de103247dc8515456b9c6040c82ad9531cd442495022e68a77b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-awesomebox-doc"
RDEPENDS:${PN} += ""

inherit rpm
