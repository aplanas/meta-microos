SUMMARY = "Python library for the BrowserID Protocol"
DESCRIPTION = "This is a python client library for the BrowserID protocol that underlies \
Mozilla Persona."
LICENSE = "MPL-2.0"

PV = "0.14.0"

RPM_NAME = "python311-PyBrowserID-0.14.0-4.8.noarch.rpm"
RPM_HASH = "665cd92c7c69b897755a4a7aae012bd020541e73a33729fa2157767f464893b17e55f9e5af3e0c17eadaf74d273d084ee15282c086b5b80d17680363bb598781"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pybrowserid) \
python311-PyBrowserID \
python3dist(pybrowserid)"

RDEPENDS:${PN} += "python(abi) \
python311-requests"

inherit rpm
