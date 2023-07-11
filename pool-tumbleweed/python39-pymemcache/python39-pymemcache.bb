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

RPM_NAME = "python39-pymemcache-4.0.0-3.3.noarch.rpm"
RPM_HASH = "2f14e3bb3f18e69e9a3fb6a361b7ab814b5029084575ec648e675dff6e092e322f0d5af7875597fd60a3f1d5d9e0f6e1a650507d2359ca3b4a9edab3f56479f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pymemcache \
python39-pymemcache \
python3dist-pymemcache"

RDEPENDS:${PN} += "python-abi"

inherit rpm
