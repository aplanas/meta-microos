SUMMARY = "Documentation for texlive-concmath-otf"
DESCRIPTION = "This package includes the documentation for texlive-concmath-otf"
LICENSE = "OFL-1.1"

PV = "2023.201.0.0.25svn65683"

RPM_NAME = "texlive-concmath-otf-doc-2023.201.0.0.25svn65683-53.1.noarch.rpm"
RPM_HASH = "19f7b49936c8ed8f93d1f35c627360c2533600a761576b2687c09bc03c5a6e415de4dad1ee1eafe45aa0e712c9f928ae9c174b132a28d30d1a2a4cc01c5cbf8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-concmath-otf-doc"

RDEPENDS:${PN} += ""

inherit rpm
