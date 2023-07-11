SUMMARY = "Roguelike dungeon exploration game (Data files)"
DESCRIPTION = "Crawl is a fun game in the grand tradition of games like Rogue, Hack, and Moria. \
Your objective is to travel deep into a subterranean cave complex and retrieve the Orb of Zot, \
which is guarded by many horrible and hideous creatures. \
 \
These are the data files for Dungeon Crawl Stone Soup."
LICENSE = "GPL-2.0-or-later"

PV = "0.28.0"

RPM_NAME = "crawl-data-0.28.0-1.6.noarch.rpm"
RPM_HASH = "8731bb868bd20cdf044bb3456bab5ac0d23295e34f6884f518dc3d67fef88cd11e22ac5d3550c47cb39a514cfba179a75603ba17bbea5cbfd734a8e62eccd40e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "crawl-data"

RDEPENDS:${PN} += "crawl"

inherit rpm
