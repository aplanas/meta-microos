SUMMARY = "Documentation for texlive-logicproof"
DESCRIPTION = "This package includes the documentation for texlive-logicproof"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn33254"

RPM_NAME = "texlive-logicproof-doc-2023.201.svn33254-54.1.noarch.rpm"
RPM_HASH = "6996208f72909d8954fe8e7ad75628f52ce18c7df9bbab183f8438dad1515db5402801f41a4672c00133370ed2faca5870a9c0e9fc9c3f72423553a36ad9d9ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-logicproof-doc"

RDEPENDS:${PN} += ""

inherit rpm
