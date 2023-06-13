SUMMARY = "Deathmatch levels for Doom"
DESCRIPTION = "A set of deathmatch levels for the DOOM game engine, based on the \
freely redistributable Freedoom game files."
LICENSE = "BSD-3-Clause"

PV = "0.12.1"

RPM_NAME = "freedoom-freedm-0.12.1-1.10.noarch.rpm"
RPM_HASH = "b89ab51c257200c005257c67faa7bbf40c8a93e7ab8ac1857fb8c9be256f9af82dfa65de6e1c31bfdd41442788f3d743cc68298f46c1a776033afa5098cba5f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "freedoom-freedm"

RDEPENDS:${PN} += "freedoom"

inherit rpm
