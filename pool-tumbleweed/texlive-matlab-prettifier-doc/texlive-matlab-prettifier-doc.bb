SUMMARY = "Documentation for texlive-matlab-prettifier"
DESCRIPTION = "This package includes the documentation for texlive-matlab-prettifier"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn34323"

RPM_NAME = "texlive-matlab-prettifier-doc-2023.201.0.0.3svn34323-52.1.noarch.rpm"
RPM_HASH = "7f8def47573d407c88dca60a02933484fd0d830dcc85f4bb30e63c486ca7576500fb5a0b907a3ecd93dc22db897745ac0484122f390db664f3ae07a5ea6014d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-matlab-prettifier-doc"
RDEPENDS:${PN} += ""

inherit rpm
