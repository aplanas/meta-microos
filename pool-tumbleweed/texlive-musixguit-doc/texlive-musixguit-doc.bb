SUMMARY = "Documentation for texlive-musixguit"
DESCRIPTION = "This package includes the documentation for texlive-musixguit"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2.2svn21649"

RPM_NAME = "texlive-musixguit-doc-2023.201.1.2.2svn21649-54.1.noarch.rpm"
RPM_HASH = "ce66531c9457ed72116d2ea6ee5ec78305e59834b4fef19fbf74064a15df60f13aa5c533e0104506711b06ad51432e3616565c22c0e1c1a4fbd203af9e77d8eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-musixguit-doc-de \
texlive-musixguit-doc"

RDEPENDS:${PN} += ""

inherit rpm
