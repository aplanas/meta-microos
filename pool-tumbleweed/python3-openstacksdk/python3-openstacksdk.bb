SUMMARY = "An SDK for building applications to work with OpenStack"
DESCRIPTION = "The openstacksdk is a library for building applications to work \
with OpenStack clouds. \
The project aims to provide a consistent and complete set of \
interactions with OpenStack's many services, along with complete \
documentation, examples, and tools. \
 \
This package contains the Python 3.x module"
LICENSE = "Apache-2.0"

PV = "1.0.1"

RPM_NAME = "python3-openstacksdk-1.0.1-1.4.noarch.rpm"
RPM_HASH = "bf33e3da81d9d8d2beb8b4a9c78d0363a03d88cd11fc3da306061191e5060a33ec60ed837807d8b4c30d2253543828e6498eda8edb885b609c1aa9f43bad61a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-openstacksdk \
python3.11dist-openstacksdk \
python3dist-openstacksdk"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh \
mkisofs \
python-abi \
python3-PyYAML \
python3-appdirs \
python3-cryptography \
python3-decorator \
python3-dogpile.cache \
python3-iso8601 \
python3-jmespath \
python3-jsonpatch \
python3-keystoneauth1 \
python3-munch \
python3-netifaces \
python3-os-service-types \
python3-requestsexceptions"

inherit rpm
