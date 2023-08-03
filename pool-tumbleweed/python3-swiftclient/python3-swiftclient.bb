SUMMARY = "OpenStack Object Storage API Client Library"
DESCRIPTION = "This is a python client for the Swift API. There's a Python API (the \
swiftclient module), and a command-line script (swift). \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "4.1.0"

RPM_NAME = "python3-swiftclient-4.1.0-1.4.noarch.rpm"
RPM_HASH = "e9c8e91f61a4150cbd875741de1f1c54016be5c56fab3274355fc8a2c8b5bb0985d94403ff9f23ce7a88ca30cf03f9b2b30847f3d2b78c4dbc953e4cfa52817c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-swiftclient \
python3.11dist-python-swiftclient \
python3dist-python-swiftclient"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-requests"

inherit rpm
