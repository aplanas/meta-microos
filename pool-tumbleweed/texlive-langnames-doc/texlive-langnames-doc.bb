SUMMARY = "Documentation for texlive-langnames"
DESCRIPTION = "This package includes the documentation for texlive-langnames"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn65502"

RPM_NAME = "texlive-langnames-doc-2023.209.2.1svn65502-56.1.noarch.rpm"
RPM_HASH = "36e638c1d164814a809776ce953266687ec228a4e911799c58340df7d489866a56c063f73d3250d9741795ced02d05402a83c534cc7f1c200ae29975011bf1d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-langnames-doc"

RDEPENDS:${PN} += ""

inherit rpm
