SUMMARY = "OpenStack Command-line Client"
DESCRIPTION = "python-openstackclient is a unified command-line client for the OpenStack APIs. \
It is a thin wrapper to the stock python-*client modules that implement the \
actual REST API client actions. \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "5.6.0"

RPM_NAME = "python3-openstackclient-5.6.0-2.6.noarch.rpm"
RPM_HASH = "4133dfcc76a89b1b5e0e2b59d4b32a851ceca92ca1b84fd4103b5730c253469869d9e3cb511cf5d1ac5030494ecc3ed7323fb24f43d9e6614ede4334de8506ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-openstackclient \
python3.10dist(python-openstackclient) \
python3dist(python-openstackclient)"

RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi) \
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
