SUMMARY = "Documentation for texlive-ucdavisthesis"
DESCRIPTION = "This package includes the documentation for texlive-ucdavisthesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn40772"

RPM_NAME = "texlive-ucdavisthesis-doc-2023.201.1.3svn40772-52.1.noarch.rpm"
RPM_HASH = "289386d9a822e75e492006672c6d6a7a13487c94d4e4d0b57ebf8e8a205072b87aa52589d1652a5112cc0ef3c9e9a41562f5e46ae3ef60d13d7863599fd69362"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ucdavisthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
