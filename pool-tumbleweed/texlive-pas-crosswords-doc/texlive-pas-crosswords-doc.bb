SUMMARY = "Documentation for texlive-pas-crosswords"
DESCRIPTION = "This package includes the documentation for texlive-pas-crosswords"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.03svn32313"

RPM_NAME = "texlive-pas-crosswords-doc-2023.209.1.03svn32313-52.1.noarch.rpm"
RPM_HASH = "0644612c608fe9cb5056fb32020633f61764c4a1a9bfee54ed815972ec6d3d8085e97b1c67c12bed9bb2c6665b9b7ebffbc760da53e84921f5b45d62d8e7d617"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pas-crosswords-doc-fr \
texlive-pas-crosswords-doc"

RDEPENDS:${PN} += ""

inherit rpm
