SUMMARY = "Python client for Redis key-value store"
DESCRIPTION = "The Python interface to the Redis key-value store."
LICENSE = "MIT"

PV = "4.5.5"

RPM_NAME = "python311-redis-4.5.5-1.4.noarch.rpm"
RPM_HASH = "929bd5b4b38523ffd562da0e111095c635b5532f4e0fe138712e4924b2ef9dd8e0005f3f8e36b84383477ef3244a08dfe69cbaf0a90b69ce331d4d3e625c2c05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-redis \
python3.11dist-redis \
python311-redis \
python3dist-redis"

RDEPENDS:${PN} += "python-abi \
python311-async-timeout \
redis"

inherit rpm
