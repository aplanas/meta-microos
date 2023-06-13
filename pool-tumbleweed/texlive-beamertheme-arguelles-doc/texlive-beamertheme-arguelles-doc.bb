SUMMARY = "Documentation for texlive-beamertheme-arguelles"
DESCRIPTION = "This package includes the documentation for texlive-beamertheme-arguelles"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1.0svn66358"

RPM_NAME = "texlive-beamertheme-arguelles-doc-2023.201.2.1.0svn66358-53.1.noarch.rpm"
RPM_HASH = "5836e778b085707d13edea2802d090eaa907f286a771a84e9f53ba119a584cedc6691605b1981b5bda6f92eefb48abf3f9ffb281907c381075ca9fcdd0ad3055"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamertheme-arguelles-doc"

RDEPENDS:${PN} += ""

inherit rpm
