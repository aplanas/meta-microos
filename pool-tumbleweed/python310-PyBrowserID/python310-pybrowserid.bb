SUMMARY = "Python library for the BrowserID Protocol"
DESCRIPTION = "This is a python client library for the BrowserID protocol that underlies \
Mozilla Persona."
LICENSE = "MPL-2.0"

PV = "0.14.0"

RPM_NAME = "python310-PyBrowserID-0.14.0-4.10.noarch.rpm"
RPM_HASH = "0fe9d1a033ff689637528125bc5cb0f92489397f9796591a1bc8b9bed76a1d022643d36916fd25734aa03223629f24626c0b8e30830dbad474639e06b72dc442"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pybrowserid \
python310-PyBrowserID \
python3dist-pybrowserid"

RDEPENDS:${PN} += "python-abi \
python310-requests"

inherit rpm
