SUMMARY = "OpenStack test framework"
DESCRIPTION = "The Oslo Test framework provides common fixtures, support for debugging, and \
better support for mocking results. \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "4.5.0"

RPM_NAME = "python3-oslotest-4.5.0-3.2.noarch.rpm"
RPM_HASH = "224d5ff902dc42951e549d7cc61634723cf8055b4f8754bea57ad015a66eb430c586d9e9514bad964eb0d235992ace922fc7c9279f32694c5da1a20eab297eef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslotest \
python3.10dist(oslotest) \
python3dist(oslotest)"
RDEPENDS:${PN} += "/bin/bash \
/usr/bin/python3 \
python(abi) \
python3-debtcollector \
python3-fixtures \
python3-python-subunit \
python3-stestr \
python3-testtools"

inherit rpm
