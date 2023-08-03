SUMMARY = "Documentation for texlive-opteng"
DESCRIPTION = "This package includes the documentation for texlive-opteng"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn27331"

RPM_NAME = "texlive-opteng-doc-2023.209.1.0svn27331-55.1.noarch.rpm"
RPM_HASH = "a795332c369ad3456b0b2786fd664a40035cb9b38fa66b9d40922a34a299a58d0959bf627e5466433038be65aedf29a6341fb0caf17c14f8b8b585ad90b03734"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-opteng-doc"

RDEPENDS:${PN} += ""

inherit rpm
