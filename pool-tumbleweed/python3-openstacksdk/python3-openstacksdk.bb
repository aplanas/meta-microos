SUMMARY = "An SDK for building applications to work with OpenStack"
DESCRIPTION = "The openstacksdk is a library for building applications to work \
with OpenStack clouds. \
The project aims to provide a consistent and complete set of \
interactions with OpenStack's many services, along with complete \
documentation, examples, and tools. \
 \
This package contains the Python 3.x module"
LICENSE = "Apache-2.0"

PV = "1.3.1"

RPM_NAME = "python3-openstacksdk-1.3.1-1.1.noarch.rpm"
RPM_HASH = "617dc2311407e345f3ef3cf6d480c1adb2ac080e08827d08b046fd7e48b469c1634e3b52524bc9bb9c8ec175c7d397c5a579d349dc4ce2e4d53b6b1c9c78b352"
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
