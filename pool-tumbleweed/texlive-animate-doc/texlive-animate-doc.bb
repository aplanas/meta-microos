SUMMARY = "Documentation for texlive-animate"
DESCRIPTION = "This package includes the documentation for texlive-animate"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn64401"

RPM_NAME = "texlive-animate-doc-2023.201.svn64401-54.1.noarch.rpm"
RPM_HASH = "8028b98a9cae42ef369d0ea772e9355cbd2762e0e626b4c6b5ed169833065d64f0f2d3e7055a614ee04863426283731c0f73afc23070c79fd7a9bae50cd91c2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-animate-doc"
RDEPENDS:${PN} += ""

inherit rpm
