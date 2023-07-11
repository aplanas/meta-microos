SUMMARY = "Documentation for texlive-revtex4-1"
DESCRIPTION = "This package includes the documentation for texlive-revtex4-1"
LICENSE = "LPPL-1.0"

PV = "2023.201.4.1ssvn56590"

RPM_NAME = "texlive-revtex4-1-doc-2023.201.4.1ssvn56590-53.2.noarch.rpm"
RPM_HASH = "3db00467a665c0bee54bebcb9a883e15b520c8d562495289f99ca9a602ea85de174270a80a2df57cf12d3acdebd0cd24ad1db40ebd55d2373493fdb1d930a279"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-revtex4-1-doc"

RDEPENDS:${PN} += ""

inherit rpm
