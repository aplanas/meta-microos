SUMMARY = "Documentation for texlive-fifo-stack"
DESCRIPTION = "This package includes the documentation for texlive-fifo-stack"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn33288"

RPM_NAME = "texlive-fifo-stack-doc-2023.209.1.0svn33288-53.1.noarch.rpm"
RPM_HASH = "aca10bb24cf7103b166608d29ea5dcf4d13b8a9fb77ea51106f82099743e9f767ce6056a1ddf91f3a2ea1c20ebae14e3a85a6c84568f697fc318b35c6a15b8f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fifo-stack-doc"

RDEPENDS:${PN} += ""

inherit rpm
