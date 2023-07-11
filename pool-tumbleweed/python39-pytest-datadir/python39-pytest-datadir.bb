SUMMARY = "Plugin for test data directories and files"
DESCRIPTION = "pytest plugin for test data directories and files."
LICENSE = "MIT"

PV = "1.4.1"

RPM_NAME = "python39-pytest-datadir-1.4.1-1.3.noarch.rpm"
RPM_HASH = "7fc87ae69352bdc32c4102b162ff5037deb6dacefec27d3222e28319e805eecb708fd647bcdcfbb52b73d85b451bbdb98d1e54db2e2f0d1e4ec81fe4beb6cf85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-datadir \
python39-pytest-datadir \
python3dist-pytest-datadir"

RDEPENDS:${PN} += "python-abi \
python39-pytest"

inherit rpm
