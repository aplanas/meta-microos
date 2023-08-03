SUMMARY = "Skiing simulation with curses interface in python"
DESCRIPTION = "Imagine you are skiing down an infinite slope, facing such hazards as \
trees, ice, bare ground, and the man-eating Yeti! Unfortunately, \
you have put your jet-powered skis on backwards, so you can't see \
ahead where you are going; only behind where you have been. However, \
you can turn to either side, jump or hop through the air, teleport \
through hyperspace, launch nuclear ICBMs, and cast spells to call the \
Fire Demon.  And since the hazards occur in patches, you can skillfully \
outmaneuver them. A fun and very silly game that proves you don't need \
fancy graphical user interfaces to have a good time."
LICENSE = "BSD-3-Clause"

PV = "6.14"

RPM_NAME = "ski-6.14-1.1.noarch.rpm"
RPM_HASH = "e7b6dec5e7ea1b5525e5f88449fa11d9b149959d647048b01d0fb643ae75835fcd23f9edd3cd2aecebf87084effcf037a529392ed4d67c7a0a77f15eb278dbcf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ski"

RDEPENDS:${PN} += "/usr/bin/env \
python3 \
python3-curses \
python3-pygame"

inherit rpm
