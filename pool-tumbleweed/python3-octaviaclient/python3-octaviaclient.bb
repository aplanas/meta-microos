SUMMARY = "Octavia Plugin for the OpenStack Command-line Client"
DESCRIPTION = "The Python Octavia Client (python-octaviaclient) is a command-line client for \
the OpenStack Load Balancing service. \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "2.5.0"

RPM_NAME = "python3-octaviaclient-2.5.0-1.7.noarch.rpm"
RPM_HASH = "357cc16cc9219a02189fb68278aec7e793a437a6fe7762fabe502d71724ce027fb6f7722deb315bce5e946361b5263a96269cd179aed9c6ddfbe1348b27005d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-octaviaclient \
python3.11dist-python-octaviaclient \
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
