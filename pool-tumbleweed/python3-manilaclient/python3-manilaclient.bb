SUMMARY = "Client Library for OpenStack Share API"
DESCRIPTION = "Client library and command line utility for interacting with Openstack \
Share API."
LICENSE = "Apache-2.0"

PV = "4.2.0"

RPM_NAME = "python3-manilaclient-4.2.0-1.7.noarch.rpm"
RPM_HASH = "07798a863235700985b9c8e5bea34c73cf14343d7c220b354056d0caa9cda019c9887452af2287cce255668b9a8efdcea8ea7750eedf90c82df19e2e776f47a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-manilaclient \
python3.11dist-python-manilaclient \
python3dist-python-manilaclient"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-Babel \
python3-PrettyTable \
python3-debtcollector \
python3-keystoneclient \
python3-osc-lib \
python3-oslo.config \
python3-oslo.log \
python3-oslo.serialization \
python3-oslo.utils \
python3-requests \
python3-simplejson"

inherit rpm
