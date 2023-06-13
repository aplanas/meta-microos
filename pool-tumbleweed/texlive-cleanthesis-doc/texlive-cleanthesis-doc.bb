SUMMARY = "Documentation for texlive-cleanthesis"
DESCRIPTION = "This package includes the documentation for texlive-cleanthesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4.0svn51472"

RPM_NAME = "texlive-cleanthesis-doc-2023.201.0.0.4.0svn51472-53.1.noarch.rpm"
RPM_HASH = "93db9931fc9193294c29cd68b2c362bde2efd30a87046c2a6f30604b3a330f22aaff6d1367476e8089e81ed713cef7fb69db8aef3fcd774b3f8750edc51bb658"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cleanthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
