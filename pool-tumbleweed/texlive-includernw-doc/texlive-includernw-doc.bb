SUMMARY = "Documentation for texlive-includernw"
DESCRIPTION = "This package includes the documentation for texlive-includernw"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.1.0svn47557"

RPM_NAME = "texlive-includernw-doc-2023.208.0.0.1.0svn47557-53.1.noarch.rpm"
RPM_HASH = "fce406e65f75a5d74d07086df90746fb01e67ff459bf8bcf671d8a06c5826107955dca338eaf2873b7babf99fd83aba53cf67a6e6ca8ef56837a195209b80343"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-includernw-doc"

RDEPENDS:${PN} += ""

inherit rpm
