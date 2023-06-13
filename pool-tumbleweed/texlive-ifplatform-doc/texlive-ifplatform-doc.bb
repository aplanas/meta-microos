SUMMARY = "Documentation for texlive-ifplatform"
DESCRIPTION = "This package includes the documentation for texlive-ifplatform"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4asvn45533"

RPM_NAME = "texlive-ifplatform-doc-2023.201.0.0.4asvn45533-52.1.noarch.rpm"
RPM_HASH = "b1ca5f1da9439f6adfff08090f23d8f79b945fc78becdef570b1c5ca8e6bfe29ca0e309dd1278f86e3880464b177857d9210574d66ad8d6028931ab2648bdbd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ifplatform-doc"

RDEPENDS:${PN} += ""

inherit rpm
