SUMMARY = "Documentation for texlive-vocaltract"
DESCRIPTION = "This package includes the documentation for texlive-vocaltract"
LICENSE = "LPPL-1.0"

PV = "2023.209.1svn25629"

RPM_NAME = "texlive-vocaltract-doc-2023.209.1svn25629-54.1.noarch.rpm"
RPM_HASH = "da6577deca0cf427989eb9c7f78c0af3f069052ccca9b170901ce6ccaa00c32d8b47fea8dd16abca21fd4337821001f2ff4b8f145a6f2e95d3039c4a18b50b7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-vocaltract-doc"

RDEPENDS:${PN} += ""

inherit rpm
