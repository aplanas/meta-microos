SUMMARY = "Text based chat client for the Rocket.chat messaging solution"
DESCRIPTION = "rocket.term is a text based client for Rocket.chat that runs in a terminal."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.0"

RPM_NAME = "rocket.term-0.2.0-2.8.noarch.rpm"
RPM_HASH = "520945dd4b6e35c67573f0337dc8322246ee7381d914f2e5526d99e3cdb87cb2d6da4184de84500e9c6d663d571a4ff25f0c23718bf55e259128685487ec4043"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-rocket.term \
python3dist-rocket.term \
rocket.term"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-requests \
python3-urwid \
python3-websocket-client"

inherit rpm
