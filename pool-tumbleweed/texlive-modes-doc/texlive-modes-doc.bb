SUMMARY = "Documentation for texlive-modes"
DESCRIPTION = "This package includes the documentation for texlive-modes"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.4.2svn61719"

RPM_NAME = "texlive-modes-doc-2023.201.4.2svn61719-54.1.noarch.rpm"
RPM_HASH = "2267ef63411a0d6b4c107a2c5dbeeeb1a1e28e0f9cd297bc168b1e4f91e44425e714ea3a25da9a07e9a1c1ae393836ad10c4db897b0deb080cc0dd7a8590242e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-modes-doc"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
