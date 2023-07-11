SUMMARY = "Client library for OpenStack Identity API"
DESCRIPTION = "Client library for interacting with Openstack Identity API."
LICENSE = "Apache-2.0"

PV = "4.5.0"

RPM_NAME = "python3-keystoneclient-4.5.0-1.6.noarch.rpm"
RPM_HASH = "05038045dc3f6281da0a2d49c34c7ca70089f68bc5118f379f87cba02ee89060a2395e249b65f660199bba75600c1f4c7eef922536e7c369cd6bb5c799248544"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-keystoneclient \
python3.10dist-python-keystoneclient \
python3dist-python-keystoneclient"

RDEPENDS:${PN} += "python-abi \
python3-debtcollector \
python3-keystoneauth1 \
python3-oslo.config \
python3-oslo.i18n \
python3-oslo.serialization \
python3-oslo.utils \
python3-requests \
python3-stevedore"

inherit rpm
