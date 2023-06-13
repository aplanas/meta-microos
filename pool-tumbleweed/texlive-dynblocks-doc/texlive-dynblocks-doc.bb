SUMMARY = "Documentation for texlive-dynblocks"
DESCRIPTION = "This package includes the documentation for texlive-dynblocks"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2bsvn35193"

RPM_NAME = "texlive-dynblocks-doc-2023.201.0.0.2bsvn35193-53.1.noarch.rpm"
RPM_HASH = "fc4d2b7c40268bff831f77ae80835a02e9b0e5e38b2b0158d0688432d66b2fb083fc34658c255c164076f6664bc2975af38742193d4cabf6c2b58cad9f042ed4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dynblocks-doc"

RDEPENDS:${PN} += ""

inherit rpm
