SUMMARY = "Documentation for texlive-hc"
DESCRIPTION = "This package includes the documentation for texlive-hc"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-hc-doc-2023.201.svn15878-53.2.noarch.rpm"
RPM_HASH = "02e04c795dac60feaeb64777993dd4016c360f1bbf3d560050fd43bacf046b87e8d40b8c1731f85e8373549456450d0d8042e888424c72a9baa2d4938a1aaae6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hc-doc"

RDEPENDS:${PN} += ""

inherit rpm
