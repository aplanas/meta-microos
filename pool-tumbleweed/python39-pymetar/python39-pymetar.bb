SUMMARY = "METAR weather report parser"
DESCRIPTION = "This library downloads the weather report for a given station ID, decodes \
it and provides easy access to all the data found in the report."
LICENSE = "GPL-2.0-or-later"

PV = "1.1"

RPM_NAME = "python39-pymetar-1.1-2.14.noarch.rpm"
RPM_HASH = "98020c8f54d8b8d066e0a2d1f54827efdc4f0eca5f5323986c520b064a498f5fd6777b845b650389a65ec3c4c1f4fa1777b33e553bbcf1e2ff5dd4a3b7580684"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pymetar \
python39-pymetar \
python3dist-pymetar"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
