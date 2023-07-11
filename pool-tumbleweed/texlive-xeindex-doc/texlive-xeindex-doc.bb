SUMMARY = "Documentation for texlive-xeindex"
DESCRIPTION = "This package includes the documentation for texlive-xeindex"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn35756"

RPM_NAME = "texlive-xeindex-doc-2023.201.0.0.3svn35756-52.2.noarch.rpm"
RPM_HASH = "ad625ed66995366d8b6ad78f9eb3bd88b33cdffef40f16d3c358257a6d0597aa9fb18f0a8e61059cdd7cca2a1a503e9fad4a0ad78556f5054db656f4af351d57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xeindex-doc"

RDEPENDS:${PN} += ""

inherit rpm
