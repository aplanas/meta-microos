SUMMARY = "Octavia Plugin for the OpenStack Command-line Client"
DESCRIPTION = "The Python Octavia Client (python-octaviaclient) is a command-line client for \
the OpenStack Load Balancing service. \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "2.5.0"

RPM_NAME = "python3-octaviaclient-2.5.0-1.5.noarch.rpm"
RPM_HASH = "b3c714fd2b329d65452791ae93b91d9116b15f03487472d996501c9734167986a6335656e3934ef4cfcf522a6ae1144cd48e24b12f61b65ee590b78094dd0bae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-octaviaclient \
python3.10dist-python-octaviaclient \
python3dist-python-octaviaclient"

RDEPENDS:${PN} += "python-abi \
python3-Babel \
python3-cliff \
python3-keystoneauth1 \
python3-netifaces \
python3-neutronclient \
python3-openstackclient \
python3-osc-lib \
python3-oslo.serialization \
python3-oslo.utils \
python3-requests"

inherit rpm
