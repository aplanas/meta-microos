SUMMARY = "Documentation for texlive-beamertheme-cuerna"
DESCRIPTION = "This package includes the documentation for texlive-beamertheme-cuerna"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn42161"

RPM_NAME = "texlive-beamertheme-cuerna-doc-2023.209.svn42161-54.1.noarch.rpm"
RPM_HASH = "35f920fba51c1dfdfe99b61ac6873891c37492754dce02367d93f9c1c7cd9042cb17d5a75b64a6e47c73b869f85de67173dc68447b0fcdbb317f77795e142239"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamertheme-cuerna-doc"

RDEPENDS:${PN} += ""

inherit rpm
