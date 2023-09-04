SUMMARY = "Documentation for texlive-repltext"
DESCRIPTION = "This package includes the documentation for texlive-repltext"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn56433"

RPM_NAME = "texlive-repltext-doc-2023.209.1.1svn56433-54.2.noarch.rpm"
RPM_HASH = "0111b23522e299e627e28ab9a3f00abac66e7f8e87f3a36a74cbf889d7cd9004cd98dc6b03b6de44a0f6e6b66504d811505e120ac42f3599990a0f18659daca4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-repltext-doc"

RDEPENDS:${PN} += ""

inherit rpm
