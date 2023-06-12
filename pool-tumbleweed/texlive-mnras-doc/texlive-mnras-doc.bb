SUMMARY = "Documentation for texlive-mnras"
DESCRIPTION = "This package includes the documentation for texlive-mnras"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.1svn55729"

RPM_NAME = "texlive-mnras-doc-2023.201.3.1svn55729-54.1.noarch.rpm"
RPM_HASH = "bfdf15f74940fd88dcdfd76336fd798993ce20ca935dcc5cfbb5179c82e589a97bcf6d5f2ab35b1a32dd9aa8688cf5980d0368a422960be5ceafda526008b1cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mnras-doc"
RDEPENDS:${PN} += ""

inherit rpm
