SUMMARY = "Documentation for texlive-proofread"
DESCRIPTION = "This package includes the documentation for texlive-proofread"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.04svn61719"

RPM_NAME = "texlive-proofread-doc-2023.201.1.04svn61719-52.1.noarch.rpm"
RPM_HASH = "2b4cd16e7a2fda568d3daf601f29bf00fed17773fb4f1101f99d1cf2631a853e44a92e1d2da6ba201c16d1f1b03cfd52910399c3e313f163cc9dfd4bdb3d85c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-proofread-doc"
RDEPENDS:${PN} += ""

inherit rpm
