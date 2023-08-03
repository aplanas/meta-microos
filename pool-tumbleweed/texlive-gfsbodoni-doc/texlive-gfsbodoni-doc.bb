SUMMARY = "Documentation for texlive-gfsbodoni"
DESCRIPTION = "This package includes the documentation for texlive-gfsbodoni"
LICENSE = "OFL-1.1"

PV = "2023.209.1.01svn28484"

RPM_NAME = "texlive-gfsbodoni-doc-2023.209.1.01svn28484-53.1.noarch.rpm"
RPM_HASH = "336b19ce629d809394b645a5a2a9f0e23e7c0bf5072992fa1d208b6e7845756228bfc3b939b0afe02faca1c3c8c5f8c1dd937915b585abf06d5bc086d26532a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gfsbodoni-doc"

RDEPENDS:${PN} += ""

inherit rpm
