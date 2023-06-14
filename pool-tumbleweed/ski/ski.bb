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

PV = "6.13"

RPM_NAME = "ski-6.13-1.9.noarch.rpm"
RPM_HASH = "0cd5c375e8ddc3151427dae0ad9547dcdc88690a4eb7634ac5fa941d13b4951bf0e925818550ccc8a76630c83d7bb1697d19747a04dd499043a1b1d854b061d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ski"

RDEPENDS:${PN} += "/usr/bin/env \
python3 \
python3-curses \
python3-pygame"

inherit rpm
