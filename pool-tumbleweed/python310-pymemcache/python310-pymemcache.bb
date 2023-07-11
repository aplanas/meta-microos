SUMMARY = "A pure Python memcached client"
DESCRIPTION = "A pure-Python memcached client. \
 \
pymemcache supports the following features: \
 \
* Complete implementation of the memcached text protocol. \
* Configurable timeouts for socket connect and send/recv calls. \
* Access to the 'noreply' flag, which can significantly increase the speed of writes. \
* Flexible, simple approach to serialization and deserialization. \
* The (optional) ability to treat network and memcached errors as cache misses."
LICENSE = "Apache-2.0"

PV = "4.0.0"

RPM_NAME = "python310-pymemcache-4.0.0-3.3.noarch.rpm"
RPM_HASH = "ff9eb84a21f362d575f8f239fed23bec4f91f35db417b1528c0d72a19d998031a907cac61472bc960e04400e9a2f9f6fa70f247585bc60b4180d11128b1ec646"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pymemcache \
python310-pymemcache \
python3dist-pymemcache"

RDEPENDS:${PN} += "python-abi"

inherit rpm
