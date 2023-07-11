SUMMARY = "Documentation for texlive-gmdoc-enhance"
DESCRIPTION = "This package includes the documentation for texlive-gmdoc-enhance"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn15878"

RPM_NAME = "texlive-gmdoc-enhance-doc-2023.201.0.0.2svn15878-53.2.noarch.rpm"
RPM_HASH = "48c6807d28637835a538626d3612e95f2989f85d1afac75a542df61f2ceaf8ee79f25e0d9677bbe76e681237c7bf67792c8decb294941d4d221354b46d7ca166"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gmdoc-enhance-doc"

RDEPENDS:${PN} += ""

inherit rpm
