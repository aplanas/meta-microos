SUMMARY = "Documentation for texlive-rsfso"
DESCRIPTION = "This package includes the documentation for texlive-rsfso"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.03svn60849"

RPM_NAME = "texlive-rsfso-doc-2023.201.1.03svn60849-53.1.noarch.rpm"
RPM_HASH = "d7a68bea690bd45b428c258fbed2b224f6f9882636f7458ee62d943e9ef1c99f91ee377aba06558955657abc3b6690e154c4abaebe7cc725bf9672fecfc1c0d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rsfso-doc"
RDEPENDS:${PN} += ""

inherit rpm
