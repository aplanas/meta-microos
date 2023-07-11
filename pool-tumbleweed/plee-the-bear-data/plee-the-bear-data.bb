SUMMARY = "Game data files for 'Plee the Bear'"
DESCRIPTION = "Plee the Bear is a 2D platform game like those found on consoles in \
the beginning of the 1990s. The storyline centeres around an angry \
bear whose son has been kidnapped by God. \
 \
This subpackage contains the game data files."
LICENSE = "CC-BY-SA-3.0"

PV = "0.7.1"

RPM_NAME = "plee-the-bear-data-0.7.1-2.24.noarch.rpm"
RPM_HASH = "67fcf45c5fdc8cf08f2f16b9d04482ab1c2baf101fe788dfb5633ba4372fc949fb6c6978195744a8940618316ebf344bdf107983c01483651a0e1b7964591804"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmake-bear \
plee-the-bear-data"

RDEPENDS:${PN} += "/usr/bin/bash \
plee-the-bear"

inherit rpm
