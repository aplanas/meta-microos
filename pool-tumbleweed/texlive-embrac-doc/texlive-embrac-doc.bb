SUMMARY = "Documentation for texlive-embrac"
DESCRIPTION = "This package includes the documentation for texlive-embrac"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.9asvn57814"

RPM_NAME = "texlive-embrac-doc-2023.201.0.0.9asvn57814-53.2.noarch.rpm"
RPM_HASH = "53e3fe6afbcb1202a22802943063b637aa147bc83ceab63331396a6b2a7d7fae3240c4adbec02f9afe6313129776b7f010dde979bf2998388aedb60ccacc3bff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-embrac-doc"

RDEPENDS:${PN} += ""

inherit rpm
