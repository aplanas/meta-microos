SUMMARY = "Client library for OpenStack Identity API"
DESCRIPTION = "Client library for interacting with Openstack Identity API."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "python3-keystoneclient-5.1.0-1.1.noarch.rpm"
RPM_HASH = "5058e5e0e7d32737138ffc92ffa60b6c1d1f11ca8b7a9bfd2e0bda356024c75558bced568cab9c979ca01609fc78492ba9209c381a8918978328cfac2c792760"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-keystoneclient \
python3.11dist-python-keystoneclient \
python3dist-python-keystoneclient"

RDEPENDS:${PN} += "python-abi \
python3-debtcollector \
python3-keystoneauth1 \
python3-oslo.config \
python3-oslo.i18n \
python3-oslo.serialization \
python3-oslo.utils \
python3-packaging \
python3-requests \
python3-stevedore"

inherit rpm
