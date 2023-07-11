SUMMARY = "Documentation for texlive-marginfix"
DESCRIPTION = "This package includes the documentation for texlive-marginfix"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.2svn55064"

RPM_NAME = "texlive-marginfix-doc-2023.208.1.2svn55064-53.1.noarch.rpm"
RPM_HASH = "b91862ef65291d3974ee5708ad2331c1158c4b025f0c565c913ca82216ddfefc28da6f1f502304b8c85851dcb5eb523723b8596cea16914bd3b0f5317185a040"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-marginfix-doc"

RDEPENDS:${PN} += ""

inherit rpm
