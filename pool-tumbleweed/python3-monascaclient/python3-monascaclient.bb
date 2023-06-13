SUMMARY = "Python API and CLI for OpenStack Monasca"
DESCRIPTION = "This is a client library for Monasca built to interface with the Monasca API. It \
provides a Python API (the ``monascaclient`` module) and a command-line tool \
(``monasca``). \
 \
The Monasca Client was written using the OpenStack Heat Python client as a framework."
LICENSE = "Apache-2.0"

PV = "2.5.0"

RPM_NAME = "python3-monascaclient-2.5.0-1.5.noarch.rpm"
RPM_HASH = "9e5d33a4cf02536ec6f653bb59485542fce412ed9522ee30741a0a15ee1cfc85aa8d4610887ad00a3acaa277a0d2b1123f1f8572d8cb5275b543f80dd5bbbc4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-monascaclient \
python3.10dist(python-monascaclient) \
python3dist(python-monascaclient)"

RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi) \
python3-Babel \
python3-PrettyTable \
python3-PyYAML \
python3-iso8601 \
python3-osc-lib \
python3-oslo.serialization \
python3-oslo.utils \
python3-pbr \
python3-requests \
python3-six"

inherit rpm
