SUMMARY = "METAR weather report parser"
DESCRIPTION = "This library downloads the weather report for a given station ID, decodes \
it and provides easy access to all the data found in the report."
LICENSE = "GPL-2.0-or-later"

PV = "1.1"

RPM_NAME = "python311-pymetar-1.1-2.14.noarch.rpm"
RPM_HASH = "98cd025b836972c244cedeb4697b2757b5e73401ed3471ab2574b6f3d3a04122aabfe8ed638a3c86d5dfcb673aa77a04a6372370f882890b9d07e35dbf9a70a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pymetar \
python3.11dist-pymetar \
python311-pymetar \
python3dist-pymetar"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
