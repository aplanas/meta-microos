SUMMARY = "Documentation for texlive-fei"
DESCRIPTION = "This package includes the documentation for texlive-fei"
LICENSE = "LPPL-1.0"

PV = "2023.201.4.10.4svn65352"

RPM_NAME = "texlive-fei-doc-2023.201.4.10.4svn65352-52.1.noarch.rpm"
RPM_HASH = "4ef6cd5678e6b4e9a609113e69aaf85b58042066c07a93b935954b9e7a4ffb8257a5c910ff2cef07bb3437f6b36bd6720d168a4ad1d7cc29692dc05c410eb906"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-fei-doc:pt_BR) \
texlive-fei-doc"

RDEPENDS:${PN} += ""

inherit rpm
