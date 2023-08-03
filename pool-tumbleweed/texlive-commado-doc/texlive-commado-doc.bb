SUMMARY = "Documentation for texlive-commado"
DESCRIPTION = "This package includes the documentation for texlive-commado"
LICENSE = "LPPL-1.0"

PV = "2023.209.r0.11asvn38875"

RPM_NAME = "texlive-commado-doc-2023.209.r0.11asvn38875-54.1.noarch.rpm"
RPM_HASH = "34e9ed54ea2684a6338de1fad89b2af6b0686ef1389861747356801c4573c524ea0129075b65045e4a44cb0c2a6f5a5c56738b4d98a463ab3df60fd1d319d8c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-commado-doc"

RDEPENDS:${PN} += ""

inherit rpm
