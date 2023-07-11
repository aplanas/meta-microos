SUMMARY = "Minetest shared data"
DESCRIPTION = "An infinite-world block sandbox game and a game engine, inspired by \
InfiniMiner, Minecraft and the like. \
 \
This package contains data for minetest and minetestserver."
LICENSE = "CC-BY-SA-3.0 & LGPL-2.1-or-later"

PV = "5.7.0"

RPM_NAME = "minetest-data-5.7.0-1.2.noarch.rpm"
RPM_HASH = "25c195f9c5cf24cfcdbed64e38335180a0909902c8804553fa9b6a288ca6c73cd1018a40bdf9cac6123ce1e3c385685110d3c30923ec7e40bb6626b942f65aff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "minetest-data"

RDEPENDS:${PN} += "google-arimo-fonts \
google-cousine-fonts \
google-droid-fonts"

inherit rpm
