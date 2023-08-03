SUMMARY = "Documentation for texlive-centeredline"
DESCRIPTION = "This package includes the documentation for texlive-centeredline"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn64672"

RPM_NAME = "texlive-centeredline-doc-2023.209.1.2svn64672-53.1.noarch.rpm"
RPM_HASH = "c56f71a52a0217070445c611f0c8f7d3547b2caab6547e570d4d5a2402c5fac2dda6b0b234fad7782ab9860cb736c572e63cb50b2f186fdb82ad5b622639995a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-centeredline-doc"

RDEPENDS:${PN} += ""

inherit rpm
