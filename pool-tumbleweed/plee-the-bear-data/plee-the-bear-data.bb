SUMMARY = "Game data files for 'Plee the Bear'"
DESCRIPTION = "Plee the Bear is a 2D platform game like those found on consoles in \
the beginning of the 1990s. The storyline centeres around an angry \
bear whose son has been kidnapped by God. \
 \
This subpackage contains the game data files."
LICENSE = "CC-BY-SA-3.0"

PV = "0.7.1"

RPM_NAME = "plee-the-bear-data-0.7.1-2.23.noarch.rpm"
RPM_HASH = "ed4eb507a64625792ad548966c64a93aceceba431973d3ab1352f38b9941167352634e2815d87afd9c2dc2e0bb0b50713da8d777cf7ddbe69c33798f07efaaab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmake(bear) \
plee-the-bear-data"

RDEPENDS:${PN} += "/bin/bash \
plee-the-bear"

inherit rpm
