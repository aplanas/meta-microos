SUMMARY = "Board game that is a bit like the well known game Risk"
DESCRIPTION = "Domination is a board game that is a bit like the well known game Risk. \
 \
Domination is a game that is a bit like the well known board game of Risk \
or RisiKo. It has many game options and includes many maps. \
 \
Written in java it includes a map editor, a simple map format, multiplayer \
network play, single player, hotseat, 5 user interfaces and many more features, \
it works in all OSs that run java."
LICENSE = "GPL-3.0-only"

PV = "1.2.7"

RPM_NAME = "domination-1.2.7-1.1.noarch.rpm"
RPM_HASH = "69822c94c676cd7a38899684923098fc77b06dacbe3d7234ebc883e642bd599939f0d793b0e74c1b9ddf11bc4d458589c08b450423e74ff44d25255e85fcbe41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(domination.desktop) \
domination"
RDEPENDS:${PN} += "/bin/sh \
domination-data \
jre"

inherit rpm
