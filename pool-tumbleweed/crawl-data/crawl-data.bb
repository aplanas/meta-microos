SUMMARY = "Roguelike dungeon exploration game (Data files)"
DESCRIPTION = "Crawl is a fun game in the grand tradition of games like Rogue, Hack, and Moria. \
Your objective is to travel deep into a subterranean cave complex and retrieve the Orb of Zot, \
which is guarded by many horrible and hideous creatures. \
 \
These are the data files for Dungeon Crawl Stone Soup."
LICENSE = "GPL-2.0-or-later"

PV = "0.28.0"

RPM_NAME = "crawl-data-0.28.0-1.5.noarch.rpm"
RPM_HASH = "d1f1d37a0824f5d5a0ca0e1d4313695a4240dfbcbb4a7b0fe87f046c3b2178325b33f2a97fe74608e7fc15a3b207ecf86e2b64f8d88b7b4a58fbd27b544a77e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "crawl-data"

RDEPENDS:${PN} += "crawl"

inherit rpm
