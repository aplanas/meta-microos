SUMMARY = "Documentation for texlive-physunits"
DESCRIPTION = "This package includes the documentation for texlive-physunits"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2.0svn58728"

RPM_NAME = "texlive-physunits-doc-2023.201.1.2.0svn58728-51.1.noarch.rpm"
RPM_HASH = "652883ef12842fb675db01394263925d50eb61513a6b1195b863e7dba1386de6eaf01e2d3c2a048666d586c2977a1bf039ced8e7b2db79e06bf96a2343d84c18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-physunits-doc"
RDEPENDS:${PN} += ""

inherit rpm
