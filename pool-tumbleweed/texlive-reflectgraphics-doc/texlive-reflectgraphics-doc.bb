SUMMARY = "Documentation for texlive-reflectgraphics"
DESCRIPTION = "This package includes the documentation for texlive-reflectgraphics"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2csvn40612"

RPM_NAME = "texlive-reflectgraphics-doc-2023.209.0.0.2csvn40612-54.1.noarch.rpm"
RPM_HASH = "5bdc2f93d9635acee450a0062a4c685912de88e6463b26aca392c03c23f95be8b1fa03024dccbe5ee6c9e1fcc6d9b8d3859ebc600b32cf75a297d37601d97d79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-reflectgraphics-doc"

RDEPENDS:${PN} += ""

inherit rpm
