SUMMARY = "Documentation for texlive-econlipsum"
DESCRIPTION = "This package includes the documentation for texlive-econlipsum"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.8.2svn58390"

RPM_NAME = "texlive-econlipsum-doc-2023.201.0.0.8.2svn58390-53.1.noarch.rpm"
RPM_HASH = "0f732248b6683f96e78f7b048616cce213cc94fcda2d0d9d244a5e9cbd38ccced8a063ce3bf12e41b990cd5459f802d651f72e2a15b4660e1a414c32baed9b41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-econlipsum-doc"

RDEPENDS:${PN} += ""

inherit rpm
