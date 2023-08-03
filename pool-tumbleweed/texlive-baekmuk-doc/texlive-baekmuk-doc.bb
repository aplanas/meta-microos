SUMMARY = "Documentation for texlive-baekmuk"
DESCRIPTION = "This package includes the documentation for texlive-baekmuk"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2.1svn56915"

RPM_NAME = "texlive-baekmuk-doc-2023.209.2.2.1svn56915-54.1.noarch.rpm"
RPM_HASH = "0ebe5c4ee73c6577eb006bc42faec40c9f4c38bf076ace3bd292eb3ff46807d1b43d80e8fe3b6c0779847c3470122bdd2033183cbac2e807dc2b51d00585d93b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-baekmuk-doc"

RDEPENDS:${PN} += ""

inherit rpm
