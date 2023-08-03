SUMMARY = "Documentation for texlive-bidipresentation"
DESCRIPTION = "This package includes the documentation for texlive-bidipresentation"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn35267"

RPM_NAME = "texlive-bidipresentation-doc-2023.209.0.0.3svn35267-54.1.noarch.rpm"
RPM_HASH = "589188fc9138c70782a0fd6348ba3399cdb8628242b38dfdfce9976721064a8fbf77678b889e7ee3902923db2cb919f1e6f384a0c33e089a9d5df9a2002daedf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bidipresentation-doc"

RDEPENDS:${PN} += ""

inherit rpm
