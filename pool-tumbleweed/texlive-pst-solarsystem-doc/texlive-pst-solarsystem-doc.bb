SUMMARY = "Documentation for texlive-pst-solarsystem"
DESCRIPTION = "This package includes the documentation for texlive-pst-solarsystem"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.13svn45097"

RPM_NAME = "texlive-pst-solarsystem-doc-2023.209.0.0.13svn45097-54.2.noarch.rpm"
RPM_HASH = "9d8a688aacaf8120ede372c2e54f3d4271df7dc6d82ebb78401172dc01a120111851a2c61e2379c43200ef8809190e0dd5c79ca60c209e97bc31600a014a7f58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-solarsystem-doc"

RDEPENDS:${PN} += ""

inherit rpm
