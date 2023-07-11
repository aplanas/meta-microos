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

RPM_NAME = "python311-pymemcache-4.0.0-3.3.noarch.rpm"
RPM_HASH = "412a9a6af9d942fc33f1c93eb77be2204540c01d33d6b876d9340f0f0dc5eb9cb1a9cd305cff005b0a45823c10f50e5fe52558c90d76362dfd68dfbd2b1612fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pymemcache \
python3.11dist-pymemcache \
python311-pymemcache \
python3dist-pymemcache"

RDEPENDS:${PN} += "python-abi"

inherit rpm
