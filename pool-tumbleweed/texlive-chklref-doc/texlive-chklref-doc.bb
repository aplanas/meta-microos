SUMMARY = "Documentation for texlive-chklref"
DESCRIPTION = "This package includes the documentation for texlive-chklref"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.3.1.2svn52649"

RPM_NAME = "texlive-chklref-doc-2023.209.3.1.2svn52649-54.1.noarch.rpm"
RPM_HASH = "01785c9cf76d7ed07499152b5c23d9b8fb84c5680a37d990a3bc9141e824e65ed2744ec64ed7da36c9ae5a353f9fc3bc89f142a91943292173b2f96feeddb822"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-chklref.1 \
texlive-chklref-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
