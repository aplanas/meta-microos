SUMMARY = "Documentation for texlive-ifmtarg"
DESCRIPTION = "This package includes the documentation for texlive-ifmtarg"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2bsvn47544"

RPM_NAME = "texlive-ifmtarg-doc-2023.209.1.2bsvn47544-54.1.noarch.rpm"
RPM_HASH = "2b1b15c3f4e1a8e467806c2c7058612412829f81581692978e9b932f051934d873854dd42fa790780db01f4989508c9538e123c3279cb3fee5b3d985be1bf151"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ifmtarg-doc"

RDEPENDS:${PN} += ""

inherit rpm
