SUMMARY = "Documentation for texlive-readablecv"
DESCRIPTION = "This package includes the documentation for texlive-readablecv"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.0svn61719"

RPM_NAME = "texlive-readablecv-doc-2023.201.3.0svn61719-53.1.noarch.rpm"
RPM_HASH = "f23e000a5be517c434667a164bbccb033ddbcc45dd7e10af43efcbd6e5cff7d57b3275e4e30226090488afc1dc3a7927245b2ac195e0bac39cff0bff475ad436"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-readablecv-doc"

RDEPENDS:${PN} += ""

inherit rpm
