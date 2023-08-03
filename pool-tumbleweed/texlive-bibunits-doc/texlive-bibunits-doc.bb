SUMMARY = "Documentation for texlive-bibunits"
DESCRIPTION = "This package includes the documentation for texlive-bibunits"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2svn15878"

RPM_NAME = "texlive-bibunits-doc-2023.209.2.2svn15878-54.1.noarch.rpm"
RPM_HASH = "0c3f145e2de8792d784511fcf032f8f2c6f178e196d00106377785e9604ffad5a6be48941f2657dece0d6f477f0c984002750b554bff172ba34c65bbc8a6c1ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bibunits-doc"

RDEPENDS:${PN} += ""

inherit rpm
