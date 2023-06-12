SUMMARY = "Documentation for texlive-beamersubframe"
DESCRIPTION = "This package includes the documentation for texlive-beamersubframe"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn23510"

RPM_NAME = "texlive-beamersubframe-doc-2023.201.0.0.2svn23510-53.1.noarch.rpm"
RPM_HASH = "18b454076fba52b3824389b46e79a688b0a9a1e8421d6a681b642a6b1d47bf4fc4bb9c2de92abf28f9422b3602eb223d5732d54e1d37c0ec7afacd77d4518f12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamersubframe-doc"
RDEPENDS:${PN} += ""

inherit rpm
