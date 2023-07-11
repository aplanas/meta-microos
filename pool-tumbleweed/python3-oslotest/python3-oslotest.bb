SUMMARY = "OpenStack test framework"
DESCRIPTION = "The Oslo Test framework provides common fixtures, support for debugging, and \
better support for mocking results. \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "4.5.0"

RPM_NAME = "python3-oslotest-4.5.0-3.3.noarch.rpm"
RPM_HASH = "d40c64d1069c755fa31482afe56ba7abb68a50028847bfcdced57e1219961e8e3aeca858d96f8abaf880f6c3db9ee28aab04028aedf9733426ececfaf4a70d5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslotest \
python3.11dist-oslotest \
python3dist-oslotest"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
python-abi \
python3-debtcollector \
python3-fixtures \
python3-python-subunit \
python3-stestr \
python3-testtools"

inherit rpm
