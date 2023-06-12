SUMMARY = "Minetest shared data"
DESCRIPTION = "An infinite-world block sandbox game and a game engine, inspired by \
InfiniMiner, Minecraft and the like. \
 \
This package contains data for minetest and minetestserver."
LICENSE = "CC-BY-SA-3.0 & LGPL-2.1-or-later"

PV = "5.7.0"

RPM_NAME = "minetest-data-5.7.0-1.1.noarch.rpm"
RPM_HASH = "b4897a067397cdedd6691784622884ffc7bed3eff85d33b6455c337bb50fd21bd4f7318b4967ee4e6a1198c60f6a213238f4331f981ddca268dde97380973cef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "minetest-data"
RDEPENDS:${PN} += "google-arimo-fonts \
google-cousine-fonts \
google-droid-fonts"

inherit rpm
