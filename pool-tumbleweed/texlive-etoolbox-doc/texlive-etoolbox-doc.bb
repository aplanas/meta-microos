SUMMARY = "Documentation for texlive-etoolbox"
DESCRIPTION = "This package includes the documentation for texlive-etoolbox"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.5ksvn56554"

RPM_NAME = "texlive-etoolbox-doc-2023.201.2.5ksvn56554-52.1.noarch.rpm"
RPM_HASH = "56a829cedfab3b24fa0c3b90730b4b38899b760ba1895b557a2caab1ccf3fd31fb66fb5bea6c3089708471f7baf3faa17758589b2eb6e4831fec67f97b314c5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-etoolbox-doc"
RDEPENDS:${PN} += ""

inherit rpm
