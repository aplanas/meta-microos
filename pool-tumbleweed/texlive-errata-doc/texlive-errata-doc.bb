SUMMARY = "Documentation for texlive-errata"
DESCRIPTION = "This package includes the documentation for texlive-errata"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn42428"

RPM_NAME = "texlive-errata-doc-2023.209.0.0.3svn42428-54.1.noarch.rpm"
RPM_HASH = "d54cb25a07fce8cab9fb29c88a4a39e06bd5fc48932139e6c85b080a36e04a5d73aac518896f54ba2c2a6e87d0aa7be9c8116e4f815c7243a10668356200475e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-errata-doc"

RDEPENDS:${PN} += ""

inherit rpm
