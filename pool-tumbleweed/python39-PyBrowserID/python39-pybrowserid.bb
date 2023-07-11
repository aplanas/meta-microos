SUMMARY = "Python library for the BrowserID Protocol"
DESCRIPTION = "This is a python client library for the BrowserID protocol that underlies \
Mozilla Persona."
LICENSE = "MPL-2.0"

PV = "0.14.0"

RPM_NAME = "python39-PyBrowserID-0.14.0-4.10.noarch.rpm"
RPM_HASH = "a732d0f8d2723f3d7ada3d29b3fc6a3b61eb698c24fe8de08aa8627c610bbd7accb93538ae83daaf94d521764490d034e3cd92d8176ef91fa9c2bc602bb9d261"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pybrowserid \
python39-PyBrowserID \
python3dist-pybrowserid"

RDEPENDS:${PN} += "python-abi \
python39-requests"

inherit rpm
