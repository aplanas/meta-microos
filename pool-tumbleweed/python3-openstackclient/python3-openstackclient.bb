SUMMARY = "OpenStack Command-line Client"
DESCRIPTION = "python-openstackclient is a unified command-line client for the OpenStack APIs. \
It is a thin wrapper to the stock python-*client modules that implement the \
actual REST API client actions. \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "5.6.0"

RPM_NAME = "python3-openstackclient-5.6.0-2.7.noarch.rpm"
RPM_HASH = "6a9bd668135293d3f11c2a0bb187d0b94875b93672b15bd8bce7b3e8bc8bd01b54d0bd64c61d61126de4a20a83a9d251a58c5d433022b501937186465eaf4920"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-openstackclient \
python3.11dist-python-openstackclient \
python3dist-python-openstackclient"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-Babel \
python3-cinderclient \
python3-cliff \
python3-glanceclient \
python3-heatclient \
python3-keystoneauth1 \
python3-keystoneclient \
python3-novaclient \
python3-openstacksdk \
python3-osc-lib \
python3-oslo.i18n \
python3-oslo.utils"

inherit rpm
