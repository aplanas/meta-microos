SUMMARY = "Documentation for texlive-quicktype"
DESCRIPTION = "This package includes the documentation for texlive-quicktype"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn42183"

RPM_NAME = "texlive-quicktype-doc-2023.209.0.0.1svn42183-54.1.noarch.rpm"
RPM_HASH = "02780b9ab0135fb476ea70a87e5578b463dd0efd1781cf4784772e2f111f80d1ede84ce4d3998b40584cbd7f0ff4d65de713656209d488d36bc584fa4533afbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quicktype-doc"

RDEPENDS:${PN} += ""

inherit rpm
