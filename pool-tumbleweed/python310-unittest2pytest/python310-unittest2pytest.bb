SUMMARY = "Convert unittest test-cases to pytest"
DESCRIPTION = "Convert unittest test-cases to pytest."
LICENSE = "GPL-3.0-or-later"

PV = "0.4"

RPM_NAME = "python310-unittest2pytest-0.4-1.15.noarch.rpm"
RPM_HASH = "40dd502d7df416efd2b169210bd6d415e33bf58d85582e02d013ab6d891fefba482b62dd621c1357857bfe47b94dcc1db687738737690afcd0f4071bb1c8b8fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-unittest2pytest \
python310-unittest2pytest \
python3dist-unittest2pytest"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
