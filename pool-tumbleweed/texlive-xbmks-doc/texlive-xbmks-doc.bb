SUMMARY = "Documentation for texlive-xbmks"
DESCRIPTION = "This package includes the documentation for texlive-xbmks"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn53448"

RPM_NAME = "texlive-xbmks-doc-2023.201.svn53448-52.1.noarch.rpm"
RPM_HASH = "77c12845fb21f331eb2ff1e52dee262965a7a0305cd4e4bc4f9484708a97513701097e4de5a48106193ba82d8f8a1a671fe1bb4da1d3112f3d761f6fa2267c6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xbmks-doc"

RDEPENDS:${PN} += ""

inherit rpm
