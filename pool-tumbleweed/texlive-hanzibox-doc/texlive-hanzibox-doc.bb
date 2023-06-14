SUMMARY = "Documentation for texlive-hanzibox"
DESCRIPTION = "This package includes the documentation for texlive-hanzibox"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.3.0svn63062"

RPM_NAME = "texlive-hanzibox-doc-2023.201.2.3.0svn63062-53.1.noarch.rpm"
RPM_HASH = "cff6961376b6789c1d3ea27663874ac0165c690905b4f312f1e6e028dbf23aaf07935f63c1822c0eab2b660ccfb95d2add8448561379b3abf8581ce457d51550"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hanzibox-doc-zh \
texlive-hanzibox-doc"

RDEPENDS:${PN} += "/bin/bash"

inherit rpm
