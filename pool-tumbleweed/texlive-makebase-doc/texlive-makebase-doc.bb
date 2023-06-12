SUMMARY = "Documentation for texlive-makebase"
DESCRIPTION = "This package includes the documentation for texlive-makebase"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn41012"

RPM_NAME = "texlive-makebase-doc-2023.201.0.0.2svn41012-52.1.noarch.rpm"
RPM_HASH = "b4f9b6b66685a60fd2661b3488269a0701fd468129ed00a00d1a3617342afd1f00fbb3cfae7bb93870eec3bc5408c5a6c8925edd5b56f61ea604342c8d19c1e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-makebase-doc"
RDEPENDS:${PN} += ""

inherit rpm
