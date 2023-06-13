SUMMARY = "Strategy game based on history, mythology and fiction"
DESCRIPTION = "In the Wyrmsun universe a myriad of inhabited planets exist. Humans dwell on Earth, \
while dwarves inhabit Nidavellir and elves nourish the world of Alfheim. These \
peoples struggle to carve a place for themselves with their tools of stone, bronze \
and iron. And perhaps one day they will meet one another, beyond the stars..."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-only"

PV = "5.3.6"

RPM_NAME = "wyrmsun-5.3.6-1.1.noarch.rpm"
RPM_HASH = "19e7e2e7c7947f08d5f6504e304e89077df50c057170ee41553e2566bc71e336d5e8e9fb4d6ad0217a733d6e59460cf44a7a28bf8440fca88e8319f21ed15aee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(wyrmsun.desktop) \
metainfo() \
metainfo(wyrmsun.appdata.xml) \
wyrmsun"

RDEPENDS:${PN} += "/bin/sh \
wyrmgus"

inherit rpm
