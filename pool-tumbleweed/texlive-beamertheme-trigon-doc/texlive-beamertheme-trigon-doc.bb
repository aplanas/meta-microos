SUMMARY = "Documentation for texlive-beamertheme-trigon"
DESCRIPTION = "This package includes the documentation for texlive-beamertheme-trigon"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7.0svn65985"

RPM_NAME = "texlive-beamertheme-trigon-doc-2023.209.0.0.7.0svn65985-54.1.noarch.rpm"
RPM_HASH = "642e35fc51543ec8d52c687ce079e6ab01a60bd0cea31632d947efdbfd01665df8e150f242203a4b29334fbbfbedb112d12db9581a9a2fd510b9c912ab70bdb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamertheme-trigon-doc"

RDEPENDS:${PN} += ""

inherit rpm
