SUMMARY = "Python API for Linstor"
DESCRIPTION = "A Python API for Linstor."
LICENSE = "GPL-3.0-only"

PV = "1.12.0"

RPM_NAME = "python310-linstor-1.12.0-1.7.aarch64.rpm"
RPM_HASH = "29dbc4f947fc7e8e2e5b952492e673328a8432fc1b97cd0b0dd944970b4829ebdcc27eb93afc1546f02f8348df771ee19bce619d64ef24bc08620755715b738e"

RPROVIDES:${PN} += "python3.10dist-python-linstor \
python310-linstor \
python3dist-python-linstor"

RDEPENDS:${PN} += "python-abi \
python310-protobuf"

inherit rpm
