SUMMARY = "Trollius and asyncio compatibility library"
DESCRIPTION = "Trololio provides a compatibility layer for Trollius and asyncio (aka Tulip). \
It addresses the differences listed in Trollius and Tulip: \
 \
* Allows the use of Trollius' syntax with asyncio. \
* Provides missing objects and aliases for the others. \
* Synchronizes debug environnement variables."
LICENSE = "MIT"

PV = "1.0"

RPM_NAME = "python310-Trololio-1.0-3.14.noarch.rpm"
RPM_HASH = "17d1f38a6e17806a1cbdac61c5fa4d27f46191069da067431a46b3c571da29b9e6303278ac8c2016077c1fa4b4e6a522905b066d1b9b3c1c2a6d148c338a5804"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Trololio \
python3.10dist(trololio) \
python310-Trololio \
python3dist(trololio)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
