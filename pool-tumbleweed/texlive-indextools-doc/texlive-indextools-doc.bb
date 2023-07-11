SUMMARY = "Documentation for texlive-indextools"
DESCRIPTION = "This package includes the documentation for texlive-indextools"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.5.1svn38931"

RPM_NAME = "texlive-indextools-doc-2023.208.1.5.1svn38931-53.1.noarch.rpm"
RPM_HASH = "b4866ae9d3161f747b1ea5344ff5e98525ea8c716df678ece0f88a57c041592f22f58fe57e0cd8abbacd9925e500c009563469c3f8f9fbefdd25afe843a49b63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-indextools-doc"

RDEPENDS:${PN} += ""

inherit rpm
