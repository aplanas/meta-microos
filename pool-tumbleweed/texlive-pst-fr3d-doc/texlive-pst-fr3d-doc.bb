SUMMARY = "Documentation for texlive-pst-fr3d"
DESCRIPTION = "This package includes the documentation for texlive-pst-fr3d"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.10svn15878"

RPM_NAME = "texlive-pst-fr3d-doc-2023.209.1.10svn15878-53.1.noarch.rpm"
RPM_HASH = "b7a88bb6d83ba890d2f16ebab98e5f5f6913146eccda3e93c68b10b684b5beed11cc243412a4bee0601bfe613345cde8a54fa9d13db3f50f6f9d3fcb4f2bec3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-fr3d-doc"

RDEPENDS:${PN} += ""

inherit rpm
