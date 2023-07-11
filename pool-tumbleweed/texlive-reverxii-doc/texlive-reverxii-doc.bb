SUMMARY = "Documentation for texlive-reverxii"
DESCRIPTION = "This package includes the documentation for texlive-reverxii"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn63753"

RPM_NAME = "texlive-reverxii-doc-2023.201.svn63753-53.2.noarch.rpm"
RPM_HASH = "f852bf732f1d3bd25cb1b84ee71452ff7f7e559b381bb3248175ddf870f44a6d85bdbea94c253be72f1c761c27cbf60480b746e75d4f72a06f01245760047e17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-reverxii-doc"

RDEPENDS:${PN} += ""

inherit rpm
