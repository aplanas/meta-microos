SUMMARY = "Documentation for texlive-wargame"
DESCRIPTION = "This package includes the documentation for texlive-wargame"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3.2svn64797"

RPM_NAME = "texlive-wargame-doc-2023.209.0.0.3.2svn64797-54.1.noarch.rpm"
RPM_HASH = "69d06dcee28fc03a1234b84bdac5af365c5771c1b90ebd2ec12865ce699abf7f548878f2266209838603f0322e56e7529b67afbfe1bacf3a3af0774e14004f97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-wargame-doc"

RDEPENDS:${PN} += ""

inherit rpm
