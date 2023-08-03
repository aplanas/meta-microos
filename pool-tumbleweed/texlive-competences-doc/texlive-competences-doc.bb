SUMMARY = "Documentation for texlive-competences"
DESCRIPTION = "This package includes the documentation for texlive-competences"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn47573"

RPM_NAME = "texlive-competences-doc-2023.209.1.0svn47573-54.1.noarch.rpm"
RPM_HASH = "0965df4946f395945df876dd23234750eaf4803893ca993515fb826e89ba39ea826cdef76f9c9d1c02e94bc4014f935987425f7e6f2ad4e09e45b7218331e2e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-competences-doc"

RDEPENDS:${PN} += ""

inherit rpm
