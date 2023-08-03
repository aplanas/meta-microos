SUMMARY = "Documentation for texlive-bezierplot"
DESCRIPTION = "This package includes the documentation for texlive-bezierplot"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn51398"

RPM_NAME = "texlive-bezierplot-doc-2023.209.1.4svn51398-54.1.noarch.rpm"
RPM_HASH = "e95206da9c50ac51c8d3ea5526562c85fb908495528c7eb2b61a829a48e685a0ba8a11c8baad9b438735de49c2cc75ff7d132ac080d51795b811be0da4915194"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bezierplot-doc"

RDEPENDS:${PN} += ""

inherit rpm
