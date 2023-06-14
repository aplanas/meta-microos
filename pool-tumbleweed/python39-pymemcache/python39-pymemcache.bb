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

RPM_NAME = "python39-pymemcache-4.0.0-3.1.noarch.rpm"
RPM_HASH = "0614c003acf5210b13d12612b453d5a13f98bab7758df4a13e1cfe190f6620ec506226657e8501154def71fc2b80b990f4bbce41c81e490f8313bad9dbf245a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pymemcache \
python39-pymemcache \
python3dist-pymemcache"

RDEPENDS:${PN} += "python-abi"

inherit rpm
