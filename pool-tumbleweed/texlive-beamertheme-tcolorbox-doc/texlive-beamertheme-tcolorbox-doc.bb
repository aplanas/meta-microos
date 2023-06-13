SUMMARY = "Documentation for texlive-beamertheme-tcolorbox"
DESCRIPTION = "This package includes the documentation for texlive-beamertheme-tcolorbox"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn64387"

RPM_NAME = "texlive-beamertheme-tcolorbox-doc-2023.201.0.0.5svn64387-53.1.noarch.rpm"
RPM_HASH = "2a368d4a1ca4d89e2121a3ff69ebf1da8aae5b455692390555638d967534bc9469c79eb99be77320feb77af97dc71e6edccc7b5c37483083bc245201e531610f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamertheme-tcolorbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
