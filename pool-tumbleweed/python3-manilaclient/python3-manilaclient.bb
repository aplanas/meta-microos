SUMMARY = "Client Library for OpenStack Share API"
DESCRIPTION = "Client library and command line utility for interacting with Openstack \
Share API."
LICENSE = "Apache-2.0"

PV = "4.2.0"

RPM_NAME = "python3-manilaclient-4.2.0-1.6.noarch.rpm"
RPM_HASH = "6c137f6275d7411e6d244d13e3094067edc18a13ee3c33b4cae15c24fea0b5cf36335cbbcfcc44a9740ea47aece7f8763bf9ea0e06e7aea5b435da951779b42a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-manilaclient \
python3.10dist-python-manilaclient \
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
