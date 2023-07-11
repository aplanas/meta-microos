SUMMARY = "Octavia Plugin for the OpenStack Command-line Client"
DESCRIPTION = "The Python Octavia Client (python-octaviaclient) is a command-line client for \
the OpenStack Load Balancing service. \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "2.5.0"

RPM_NAME = "python3-octaviaclient-2.5.0-1.6.noarch.rpm"
RPM_HASH = "343f59e12c36ba91aca2a35bd4b6927be8f7fbacc2dae7b4c8f324489e11d314a699def34127454ee53a9823a98a4d4de3bf149e6a38021e4a5606b271e22214"
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
