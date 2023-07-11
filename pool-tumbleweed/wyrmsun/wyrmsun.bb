SUMMARY = "Strategy game based on history, mythology and fiction"
DESCRIPTION = "In the Wyrmsun universe a myriad of inhabited planets exist. Humans dwell on Earth, \
while dwarves inhabit Nidavellir and elves nourish the world of Alfheim. These \
peoples struggle to carve a place for themselves with their tools of stone, bronze \
and iron. And perhaps one day they will meet one another, beyond the stars..."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-only"

PV = "5.3.6"

RPM_NAME = "wyrmsun-5.3.6-1.2.noarch.rpm"
RPM_HASH = "92e13c0c30827144b18e301e0e7f6fe48d938c390928719bfc1d1a6ee1173ee1b9576a6a945ac0dc7a1280ed729cdcb1d2e83191928672659caf1fb2d41bc964"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wyrmsun"

RDEPENDS:${PN} += "/usr/bin/sh \
wyrmgus"

inherit rpm
