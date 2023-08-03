SUMMARY = "Documentation for texlive-nowidow"
DESCRIPTION = "This package includes the documentation for texlive-nowidow"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn24066"

RPM_NAME = "texlive-nowidow-doc-2023.209.1.0svn24066-55.1.noarch.rpm"
RPM_HASH = "38b3ce5a937c93af7a6a08544343ba08d6c43505830eb367b5e2bb870a5ce5c11cad9430e943a4912e485a481e766131e77065fc6ba179d279e67c275c7befab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nowidow-doc"

RDEPENDS:${PN} += ""

inherit rpm
