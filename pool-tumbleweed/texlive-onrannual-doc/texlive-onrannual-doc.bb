SUMMARY = "Documentation for texlive-onrannual"
DESCRIPTION = "This package includes the documentation for texlive-onrannual"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn17474"

RPM_NAME = "texlive-onrannual-doc-2023.201.1.1svn17474-54.1.noarch.rpm"
RPM_HASH = "88147581d7747caf4bd93ed59669e1664a120377c210dc4aa2b0e63c67d6dd115a8f8840ae62e5dd87fe17711035f8dbbcf606bf160992d8f18e173a1cb317c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-onrannual-doc"

RDEPENDS:${PN} += ""

inherit rpm
