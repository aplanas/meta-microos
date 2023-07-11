SUMMARY = "Documentation for texlive-elements"
DESCRIPTION = "This package includes the documentation for texlive-elements"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4svn61792"

RPM_NAME = "texlive-elements-doc-2023.201.0.0.4svn61792-53.2.noarch.rpm"
RPM_HASH = "6070de916e18a9e2f51086a5ffcbfe437e1dab6c1ba4f77554b07732139e6069cf0a0047c184568265175c01b651d967878dfc79f6c18b285024c36626b68cab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-elements-doc"

RDEPENDS:${PN} += ""

inherit rpm
