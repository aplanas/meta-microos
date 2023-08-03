SUMMARY = "Documentation for texlive-mversion"
DESCRIPTION = "This package includes the documentation for texlive-mversion"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.1svn29370"

RPM_NAME = "texlive-mversion-doc-2023.209.1.0.1svn29370-55.1.noarch.rpm"
RPM_HASH = "e85df9f5de5a3eef61ca3c3f5ec7a8f8bb47ad9beb11ed49cc927db750036f5471618a248a4be64a28889a4053896e066b15d39e0c0a54fb5fbbeb00bf350b0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mversion-doc"

RDEPENDS:${PN} += ""

inherit rpm
