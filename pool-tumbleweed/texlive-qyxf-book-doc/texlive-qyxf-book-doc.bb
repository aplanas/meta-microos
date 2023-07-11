SUMMARY = "Documentation for texlive-qyxf-book"
DESCRIPTION = "This package includes the documentation for texlive-qyxf-book"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.1.0svn56319"

RPM_NAME = "texlive-qyxf-book-doc-2023.201.3.1.0svn56319-53.2.noarch.rpm"
RPM_HASH = "5aac9dd2171e9ae65c4e9a94d8f861dfee471ef37ce4f9703d8b71ed3f2eac55dca9caafee4ac5c9df7d71b703d3177f09a37116c72a0f46c55b03de617186ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-qyxf-book-doc-zh \
texlive-qyxf-book-doc"

RDEPENDS:${PN} += ""

inherit rpm
