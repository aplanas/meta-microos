SUMMARY = "METAR weather report parser"
DESCRIPTION = "This library downloads the weather report for a given station ID, decodes \
it and provides easy access to all the data found in the report."
LICENSE = "GPL-2.0-or-later"

PV = "1.1"

RPM_NAME = "python310-pymetar-1.1-2.14.noarch.rpm"
RPM_HASH = "90db1a7609cc918e6aadae4d446a6b89cd5353441cdbbc8e629c4e92e73fa7338cbd81e1442dafc29affeb9bd76afc74167f056bba9536e67b65a51b6a37e6f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pymetar \
python310-pymetar \
python3dist-pymetar"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
