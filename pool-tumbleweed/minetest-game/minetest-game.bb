SUMMARY = "Minetest Game"
DESCRIPTION = "The main game for the Minetest game engine."
LICENSE = "CC-BY-3.0 & CC-BY-SA-3.0 & LGPL-2.1-or-later & CC-BY-SA-4.0 & CC0-1.0"

PV = "5.7.0"

RPM_NAME = "minetest-game-5.7.0-1.1.noarch.rpm"
RPM_HASH = "a12e0072c7d589fdf474038c5e732a14fee8b57b89ecfeacc00dae75e8320452667c531ec9e622490d7616bbc7af74b6cb383b55a1a08242e86728ce63bd6dce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "minetest-game"
RDEPENDS:${PN} += "minetest-runtime"

inherit rpm
