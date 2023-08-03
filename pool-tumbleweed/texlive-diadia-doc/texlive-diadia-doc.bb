SUMMARY = "Documentation for texlive-diadia"
DESCRIPTION = "This package includes the documentation for texlive-diadia"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn37656"

RPM_NAME = "texlive-diadia-doc-2023.209.1.1svn37656-53.1.noarch.rpm"
RPM_HASH = "962034d885165b255724e08c0def5f6b96db8e9662abec1bafdc35b25579d604115353d4b594d201ee8c6e5d5140988d43eca45970747a7c62f4931ad10ea0a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-diadia-doc"

RDEPENDS:${PN} += ""

inherit rpm
