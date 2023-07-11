SUMMARY = "Plugin for test data directories and files"
DESCRIPTION = "pytest plugin for test data directories and files."
LICENSE = "MIT"

PV = "1.4.1"

RPM_NAME = "python311-pytest-datadir-1.4.1-1.3.noarch.rpm"
RPM_HASH = "98a22a27efebee8aafcb2201a529137e251992e90533da1e20ba1e9b68907fc49476f2babfdef83c7e21e136f78613199c09efec71e28800ea9c4cce7f18a711"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-datadir \
python3.11dist-pytest-datadir \
python311-pytest-datadir \
python3dist-pytest-datadir"

RDEPENDS:${PN} += "python-abi \
python311-pytest"

inherit rpm
