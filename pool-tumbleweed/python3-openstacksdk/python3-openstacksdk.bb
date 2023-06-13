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

RPM_NAME = "python3-openstacksdk-1.0.1-1.3.noarch.rpm"
RPM_HASH = "ee7c090684173d8bab7327609a9ab612d06a31d26028b479b087dbfa927c2fcb77cf02a78800a6dbeec93f44fcd551579e7ba902b45eac5d4d935fca705e1cd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-openstacksdk \
python3.10dist(openstacksdk) \
python3dist(openstacksdk)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/python3 \
mkisofs \
python(abi) \
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
