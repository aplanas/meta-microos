SUMMARY = "Documentation for texlive-aboensis"
DESCRIPTION = "This package includes the documentation for texlive-aboensis"
LICENSE = "OFL-1.1"

PV = "2023.201.svn62977"

RPM_NAME = "texlive-aboensis-doc-2023.201.svn62977-54.1.noarch.rpm"
RPM_HASH = "57eceb25fd5f18d0b62f35167ccf6370b5b498e9ea0cec209d27b089ec5dcba831695bdfe4f43bc8fe292bd34d2455831f8050c83276799ed6b5ff7223fa9475"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-aboensis-doc"
RDEPENDS:${PN} += ""

inherit rpm
