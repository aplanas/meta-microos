SUMMARY = "Documentation for texlive-ipaex-type1"
DESCRIPTION = "This package includes the documentation for texlive-ipaex-type1"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn47700"

RPM_NAME = "texlive-ipaex-type1-doc-2023.201.0.0.5svn47700-55.1.noarch.rpm"
RPM_HASH = "5e2a972cf505c2c151825cce173cc9304f7cd251b27b5e463ceb85397b1af73b919904eafd7d43a534080703d127c767850d285e4262307ca45e4525f90343c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-ipaex-type1-doc:ja;en) \
texlive-ipaex-type1-doc"

RDEPENDS:${PN} += ""

inherit rpm
