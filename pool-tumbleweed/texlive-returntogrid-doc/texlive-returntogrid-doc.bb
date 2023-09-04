SUMMARY = "Documentation for texlive-returntogrid"
DESCRIPTION = "This package includes the documentation for texlive-returntogrid"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn48485"

RPM_NAME = "texlive-returntogrid-doc-2023.209.0.0.2svn48485-54.2.noarch.rpm"
RPM_HASH = "924871c6b548fd78091ba4152cec4a51dcd067d4a8fa4dd8285e6f5a86bf2b8a5d957c7545751db96a4e431040b0daf971309c0e4fb7c0258eae83a893460a22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-returntogrid-doc"

RDEPENDS:${PN} += ""

inherit rpm
