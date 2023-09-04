SUMMARY = "Documentation for texlive-rest-api"
DESCRIPTION = "This package includes the documentation for texlive-rest-api"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn57068"

RPM_NAME = "texlive-rest-api-doc-2023.209.1.4svn57068-54.2.noarch.rpm"
RPM_HASH = "ae7788d928742a957d1ec42c2f90d1c490a683739bd6d14ff80afe31f3c940bdf6b6584b563f68d93c8d2de859ab80b7ee2959cebf55c08ddfc9be984052a10e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rest-api-doc"

RDEPENDS:${PN} += ""

inherit rpm
