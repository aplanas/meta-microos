SUMMARY = "Python library for the BrowserID Protocol"
DESCRIPTION = "This is a python client library for the BrowserID protocol that underlies \
Mozilla Persona."
LICENSE = "MPL-2.0"

PV = "0.14.0"

RPM_NAME = "python39-PyBrowserID-0.14.0-4.8.noarch.rpm"
RPM_HASH = "b00766c8a10531c81944af7ad27eff9d2d2e9c9b8dc21a13e6b0832c7d5ca48e759fae752bad7d9cb643fde0b498e29fa3af63d634be11d8c537b1b132384bee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pybrowserid) \
python39-PyBrowserID \
python3dist(pybrowserid)"

RDEPENDS:${PN} += "python(abi) \
python39-requests"

inherit rpm
