SUMMARY = "Documentation for texlive-tugboat-plain"
DESCRIPTION = "This package includes the documentation for texlive-tugboat-plain"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.27svn63386"

RPM_NAME = "texlive-tugboat-plain-doc-2023.201.1.27svn63386-52.1.noarch.rpm"
RPM_HASH = "724e03c16eacefb9ffa8a66d3267327e76a7d0b5a3028072118f691061f4f5e2475c9f42df2ef9ee18772fa60a43a25efb6b4cef35c285134aebd48d29c02693"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tugboat-plain-doc"

RDEPENDS:${PN} += ""

inherit rpm
