SUMMARY = "Documentation for texlive-powerdot"
DESCRIPTION = "This package includes the documentation for texlive-powerdot"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.7svn59272"

RPM_NAME = "texlive-powerdot-doc-2023.201.1.7svn59272-52.1.noarch.rpm"
RPM_HASH = "1d3baa784edc54d8a306510fbe9c06e323e4bc1cf3649fada811041e1516d80616dece38fd9e20efe50b10c1fa1549e078fece1a8424e6e7cc1065da0cc66a92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-powerdot-doc-en;de \
texlive-powerdot-doc"

RDEPENDS:${PN} += ""

inherit rpm
