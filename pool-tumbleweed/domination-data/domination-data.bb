SUMMARY = "Data files for Domination"
DESCRIPTION = "Domination is a board game that is a bit like the well known game Risk. \
 \
Domination is a game that is a bit like the well known board game of Risk \
or RisiKo. It has many game options and includes many maps. \
 \
Written in java it includes a map editor, a simple map format, multiplayer \
network play, single player, hotseat, 5 user interfaces and many more features, \
it works in all OSs that run java. \
 \
Data files (cards, maps and images) for Domination."
LICENSE = "GPL-3.0"

PV = "20140921"

RPM_NAME = "domination-data-20140921-1.18.noarch.rpm"
RPM_HASH = "c9a3cc1e5e596f91ab8a867cc190664d21089cdea00b5b6ac7d6a03909c7a09c10a6fffa34060491a665cd56c288369b937e3f4c2ce8664f3b0af7d8cbd6bb20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "domination-data"

RDEPENDS:${PN} += "domination"

inherit rpm
