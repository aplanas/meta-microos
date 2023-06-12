SUMMARY = "Documentation for texlive-beamertheme-metropolis"
DESCRIPTION = "This package includes the documentation for texlive-beamertheme-metropolis"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn43031"

RPM_NAME = "texlive-beamertheme-metropolis-doc-2023.201.1.2svn43031-53.1.noarch.rpm"
RPM_HASH = "ac4224959c111d7102ba95754c5a3ee9b85ec6087872acd4c3c504ab2540cbee8020da797eb33d3668f00a7585c9ec184bbcc7f346913b82eb310a553c839882"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamertheme-metropolis-doc"
RDEPENDS:${PN} += ""

inherit rpm
