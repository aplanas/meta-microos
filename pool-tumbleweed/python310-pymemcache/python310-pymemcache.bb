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

RPM_NAME = "python310-pymemcache-4.0.0-3.1.noarch.rpm"
RPM_HASH = "27d74971c89afdb8878b9687c659acdb01b3bcaf4cb234c70c1e30eb2aebc847ec8c88486d7e26546782f4813ccbb2431ee9c62e1706ef82e3d329ed01b40c69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pymemcache \
python3.10dist(pymemcache) \
python310-pymemcache \
python3dist(pymemcache)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
