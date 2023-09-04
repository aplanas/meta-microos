SUMMARY = "Documentation for texlive-ellipse"
DESCRIPTION = "This package includes the documentation for texlive-ellipse"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn39025"

RPM_NAME = "texlive-ellipse-doc-2023.209.1.0svn39025-54.2.noarch.rpm"
RPM_HASH = "670d269a34eb016a010e379fb56dc0dab84eaf44c26a097d81a5ee79fc946af2cac85404647c15beacb0d49e4aa62c8287bb8d03c351a9a71a8b4c9fc8406225"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ellipse-doc"

RDEPENDS:${PN} += ""

inherit rpm
