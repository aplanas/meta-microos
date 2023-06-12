SUMMARY = "Documentation for texlive-jobname-suffix"
DESCRIPTION = "This package includes the documentation for texlive-jobname-suffix"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn64797"

RPM_NAME = "texlive-jobname-suffix-doc-2023.201.1.0svn64797-55.1.noarch.rpm"
RPM_HASH = "67924998e83c82b9c13032945f10c7e98ded662df25450ae6998c24d90c8fbb2cf7dcbcb9cfa21147afb0a57d3e7bd1eb15b1873fa84640ed335547545c626ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jobname-suffix-doc"
RDEPENDS:${PN} += ""

inherit rpm
