SUMMARY = "Documentation for texlive-easy"
DESCRIPTION = "This package includes the documentation for texlive-easy"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.99svn19440"

RPM_NAME = "texlive-easy-doc-2023.209.0.0.99svn19440-54.1.noarch.rpm"
RPM_HASH = "d5f0f6a6bfff8201b1352dfdb7e860455daeb05ed46df427497c3df0c25177783eb2c6cf870431f4bc3858c25064a3f134bac734bbfc5515c12c9a88d455b0a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-easy-doc"

RDEPENDS:${PN} += ""

inherit rpm
