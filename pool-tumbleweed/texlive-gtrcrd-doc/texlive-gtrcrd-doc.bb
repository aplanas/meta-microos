SUMMARY = "Documentation for texlive-gtrcrd"
DESCRIPTION = "This package includes the documentation for texlive-gtrcrd"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn32484"

RPM_NAME = "texlive-gtrcrd-doc-2023.209.1.1svn32484-54.1.noarch.rpm"
RPM_HASH = "791d3e11b5b69769180b0fc94cec8a96404d981f370c1082d4b7254a43e91f55f02d8846eff15e44095400d1f7e0f87303cc3cf3384513b527fc731cdc5706f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gtrcrd-doc"

RDEPENDS:${PN} += ""

inherit rpm
