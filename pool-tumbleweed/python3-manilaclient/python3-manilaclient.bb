SUMMARY = "Client Library for OpenStack Share API"
DESCRIPTION = "Client library and command line utility for interacting with Openstack \
Share API."
LICENSE = "Apache-2.0"

PV = "4.2.0"

RPM_NAME = "python3-manilaclient-4.2.0-1.5.noarch.rpm"
RPM_HASH = "ff05e5165f3b81a784e0ffc08487347469da57c003950f1524be7aefc4e4f3f671fc0468d03ca69fa9ec415e612916537f8725fb40220d96b8c81ea533f32379"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-manilaclient \
python3.10dist(python-manilaclient) \
python3dist(python-manilaclient)"

RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi) \
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
