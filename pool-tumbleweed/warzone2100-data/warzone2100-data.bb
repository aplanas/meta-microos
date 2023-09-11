SUMMARY = "Data files for Warzone 2100"
DESCRIPTION = "You command the forces of 'The Project' in a battle to rebuild \
the world after mankind has almost been destroyed by nuclear \
missiles. \
 \
The game offers campaign, multi-player and single-player skirmish \
modes. An extensive tech tree with over 400 different \
technologies, combined with the unit design system, allows for \
a wide variety of possible units and tactics. \
 \
Warzone 2100 was originally developed as a commercial game by \
Pumpkin Studios and published in 1999, and was released as \
open source by them in 2004, for the community to continue \
working on it. \
 \
This package provides the game data for Warzone 2100."
LICENSE = "BSD-3-Clause & CC-BY-SA-3.0 & GPL-3.0-or-later & CC0-1.0 & LGPL-2.1-only"

PV = "4.3.5"

RPM_NAME = "warzone2100-data-4.3.5-2.1.noarch.rpm"
RPM_HASH = "90cec1157ec4c5e88dd30b36eb0135ae92e9a6d7c09a8677020b8cb3d19fa17a018cf9cc16e82d48e451f4e3b88dea3f6979b94daee0651afe0330e492982d16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "warzone2100-data"

RDEPENDS:${PN} += "warzone2100"

inherit rpm
