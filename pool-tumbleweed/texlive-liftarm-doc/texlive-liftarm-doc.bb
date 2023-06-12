SUMMARY = "Documentation for texlive-liftarm"
DESCRIPTION = "This package includes the documentation for texlive-liftarm"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn62981"

RPM_NAME = "texlive-liftarm-doc-2023.201.2.0svn62981-54.1.noarch.rpm"
RPM_HASH = "e228f035bc1563c2439037091563d7de198d422cca3a6f74ac265f4ebe68a2567203f3fd6a1230d1038ef37046b5b458ebb3087c103302700766884cfd330f5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-liftarm-doc"
RDEPENDS:${PN} += ""

inherit rpm
