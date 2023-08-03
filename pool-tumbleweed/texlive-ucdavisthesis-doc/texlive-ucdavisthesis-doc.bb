SUMMARY = "Documentation for texlive-ucdavisthesis"
DESCRIPTION = "This package includes the documentation for texlive-ucdavisthesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn40772"

RPM_NAME = "texlive-ucdavisthesis-doc-2023.209.1.3svn40772-53.1.noarch.rpm"
RPM_HASH = "8e76340a0f270cbed4e176f7c62f7f77c010c52b07950ba7048c6a76ed57d50b5036b2f1941f0b865c57a504522ff181441935f1b87e84cc85dc904ca3019fc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ucdavisthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
