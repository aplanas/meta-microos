SUMMARY = "Documentation for texlive-babel-occitan"
DESCRIPTION = "This package includes the documentation for texlive-babel-occitan"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn39608"

RPM_NAME = "texlive-babel-occitan-doc-2023.201.0.0.2svn39608-53.1.noarch.rpm"
RPM_HASH = "8326478ae0c810ee373c8152b522e4e4949a15754881118720f4ed1be32d52481424fed09505c21785523dc82055d2e3b2b938e53238b28e6b5172ff6865b8f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-occitan-doc"

RDEPENDS:${PN} += ""

inherit rpm
