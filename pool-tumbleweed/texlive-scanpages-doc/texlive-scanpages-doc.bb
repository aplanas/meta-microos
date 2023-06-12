SUMMARY = "Documentation for texlive-scanpages"
DESCRIPTION = "This package includes the documentation for texlive-scanpages"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.05asvn42633"

RPM_NAME = "texlive-scanpages-doc-2023.201.1.05asvn42633-53.1.noarch.rpm"
RPM_HASH = "1f6fec777a47cc294932cc909f0a6b9e712babd41212854e4b82e884d914940f0a2171ec028c0743ebda28881f4c2a18bd9b2ac3bd90d0d28e28df6994fe50a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scanpages-doc"
RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
