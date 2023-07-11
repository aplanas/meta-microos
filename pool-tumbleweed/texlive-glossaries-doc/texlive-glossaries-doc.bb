SUMMARY = "Documentation for texlive-glossaries"
DESCRIPTION = "This package includes the documentation for texlive-glossaries"
LICENSE = "LPPL-1.0"

PV = "2023.201.4.52svn64919"

RPM_NAME = "texlive-glossaries-doc-2023.201.4.52svn64919-53.2.noarch.rpm"
RPM_HASH = "7a3e96a5463fc53ec2dcc8d714a1079e0a16039f657d9e1278cd6740b834dc35f7d4ec1f2bb8d9936dc0ebeaec27661cac1fedc00b940546d0aea7a92ebf29ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-makeglossaries-lite.1 \
man-makeglossaries.1 \
texlive-glossaries-doc"

RDEPENDS:${PN} += ""

inherit rpm
