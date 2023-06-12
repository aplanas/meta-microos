SUMMARY = "Documentation for texlive-beamertheme-epyt"
DESCRIPTION = "This package includes the documentation for texlive-beamertheme-epyt"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn41404"

RPM_NAME = "texlive-beamertheme-epyt-doc-2023.201.1.0svn41404-53.1.noarch.rpm"
RPM_HASH = "1771dd77739d635be0a4bdcafacbf6dba19582eb83448cc603a86140a265de0ced45e54b3784964e1ce86a9959a8902f0599617f3384e33e321db9f8c50d298c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-beamertheme-epyt-doc:zh) \
texlive-beamertheme-epyt-doc"
RDEPENDS:${PN} += ""

inherit rpm
