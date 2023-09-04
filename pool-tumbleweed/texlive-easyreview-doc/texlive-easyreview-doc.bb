SUMMARY = "Documentation for texlive-easyreview"
DESCRIPTION = "This package includes the documentation for texlive-easyreview"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn38352"

RPM_NAME = "texlive-easyreview-doc-2023.209.1.0svn38352-54.2.noarch.rpm"
RPM_HASH = "72b13284173f578a449e1fb5286cacd3208ea3f1cd8f0524944a26f646035541caa0ed8fe2f4e6196e89b64596ba585ca5b6017c7f2f65d813a0588dbc9ee756"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-easyreview-doc"

RDEPENDS:${PN} += ""

inherit rpm
