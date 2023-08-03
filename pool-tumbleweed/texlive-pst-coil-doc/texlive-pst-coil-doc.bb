SUMMARY = "Documentation for texlive-pst-coil"
DESCRIPTION = "This package includes the documentation for texlive-pst-coil"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.07svn62977"

RPM_NAME = "texlive-pst-coil-doc-2023.209.1.07svn62977-53.1.noarch.rpm"
RPM_HASH = "4d0fbb21c22c3cec12a0035570924e48fecacb0553a2de96e1946f9895fb5789e56c72d7d3b64a9b81ab17091150de0af1efeb28d3eba04738c3db49cb7e77b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-coil-doc"

RDEPENDS:${PN} += ""

inherit rpm
