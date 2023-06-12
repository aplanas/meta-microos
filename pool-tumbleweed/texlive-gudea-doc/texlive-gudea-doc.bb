SUMMARY = "Documentation for texlive-gudea"
DESCRIPTION = "This package includes the documentation for texlive-gudea"
LICENSE = "OFL-1.1"

PV = "2023.201.0.0.0.1svn57359"

RPM_NAME = "texlive-gudea-doc-2023.201.0.0.0.1svn57359-53.1.noarch.rpm"
RPM_HASH = "90b0435c0a1cdeaabac62d9b51368e4d63920003e5369fbd9f2e17b2f6a432f67039ded9973d900b2f7771a4e2f68f3dc149482aff8f1efa6fd518cbee863708"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gudea-doc"
RDEPENDS:${PN} += ""

inherit rpm
