SUMMARY = "Documentation for texlive-matlab-prettifier"
DESCRIPTION = "This package includes the documentation for texlive-matlab-prettifier"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.3svn34323"

RPM_NAME = "texlive-matlab-prettifier-doc-2023.208.0.0.3svn34323-53.1.noarch.rpm"
RPM_HASH = "c9560252affa58caa5d685a9f606a2fde46fce7d690d3c17aa890992b12b42302b9bcde02ed3778ff5dda77255bf1ef8563f458e5775a3d2a80c4c6aad643465"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-matlab-prettifier-doc"

RDEPENDS:${PN} += ""

inherit rpm
