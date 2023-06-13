SUMMARY = "Documentation for texlive-shadow"
DESCRIPTION = "This package includes the documentation for texlive-shadow"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn20312"

RPM_NAME = "texlive-shadow-doc-2023.201.svn20312-53.1.noarch.rpm"
RPM_HASH = "9f677f476b55e56989276bd37317b552c2beabe7aa28aeefbaa6024a6ca51b13e93c563856caa5275d21282d1e0a70323c91ccb557035ab436352f92c4bb7cbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-shadow-doc"

RDEPENDS:${PN} += ""

inherit rpm
