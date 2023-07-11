SUMMARY = "Documentation for texlive-elbioimp"
DESCRIPTION = "This package includes the documentation for texlive-elbioimp"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn21758"

RPM_NAME = "texlive-elbioimp-doc-2023.201.1.2svn21758-53.2.noarch.rpm"
RPM_HASH = "e0dc3d95208a9e6fab8c4220ca4c172be374602b7927b95ee4d6ec005cc0e8c8daf3b5a4557ca40d7b0451dd9d3c3f764d8143b7747fe53c7430f52f80580de2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-elbioimp-doc"

RDEPENDS:${PN} += ""

inherit rpm
