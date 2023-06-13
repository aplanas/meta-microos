SUMMARY = "Text based chat client for the Rocket.chat messaging solution"
DESCRIPTION = "rocket.term is a text based client for Rocket.chat that runs in a terminal."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.0"

RPM_NAME = "rocket.term-0.2.0-2.7.noarch.rpm"
RPM_HASH = "491107b799b3ffac9b70e4202274fbc9fd8e1bdbf7f8880b5d5b2e8d64035411ce3d3f895a656582253a61a6b35ab60a303211d5c128a7e7c0983767f30d89ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist(rocket.term) \
python3dist(rocket.term) \
rocket.term"

RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi) \
python3-requests \
python3-urwid \
python3-websocket-client"

inherit rpm
