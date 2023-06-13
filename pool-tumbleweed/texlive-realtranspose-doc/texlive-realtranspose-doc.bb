SUMMARY = "Documentation for texlive-realtranspose"
DESCRIPTION = "This package includes the documentation for texlive-realtranspose"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn56623"

RPM_NAME = "texlive-realtranspose-doc-2023.201.1.1svn56623-53.1.noarch.rpm"
RPM_HASH = "49e3786df837da42c369c620a6f992eea1fc000ae6f206d8afe86e65ed220981833a0c815565a68bc0d03950d221bf830ba3d91aa170265392e43ed932b491fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-realtranspose-doc"

RDEPENDS:${PN} += ""

inherit rpm
