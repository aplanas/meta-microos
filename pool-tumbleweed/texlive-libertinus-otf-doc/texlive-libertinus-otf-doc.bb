SUMMARY = "Documentation for texlive-libertinus-otf"
DESCRIPTION = "This package includes the documentation for texlive-libertinus-otf"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.29svn60023"

RPM_NAME = "texlive-libertinus-otf-doc-2023.209.0.0.29svn60023-55.1.noarch.rpm"
RPM_HASH = "93f0109640b82bbd0135abf00818a5d1c7e0d50e30ed021153678cc1336ab64ab08585f3b7518eb4478d05b5025fb8f1b5e511fba108b3cacbb50468816249d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-libertinus-otf-doc"

RDEPENDS:${PN} += ""

inherit rpm
