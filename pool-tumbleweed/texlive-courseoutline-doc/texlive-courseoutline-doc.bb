SUMMARY = "Documentation for texlive-courseoutline"
DESCRIPTION = "This package includes the documentation for texlive-courseoutline"
LICENSE = "LPPL-1.0"

PV = "2023.204.1.0svn15878"

RPM_NAME = "texlive-courseoutline-doc-2023.204.1.0svn15878-54.1.noarch.rpm"
RPM_HASH = "ee8bd5e99be174bdb06af2ffd8a59fa8dfbeeacb9b1679332dcaa8655c54920562221b74842d0c05d0ca20f3befa21554aa58c4cde8bee87afe796cd6e97cd04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-courseoutline-doc"

RDEPENDS:${PN} += ""

inherit rpm
