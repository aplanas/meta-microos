SUMMARY = "Python client for Redis key-value store"
DESCRIPTION = "The Python interface to the Redis key-value store."
LICENSE = "MIT"

PV = "4.5.5"

RPM_NAME = "python39-redis-4.5.5-1.4.noarch.rpm"
RPM_HASH = "86f9cb54c6412e23da76508f72d8f01778dd03c9d65752889be5b105b1daa62c6abe6fa02b2392394f2b4fef6127762de4949d8ca6ca92c722158711b24454b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-redis \
python39-redis \
python3dist-redis"

RDEPENDS:${PN} += "python-abi \
python39-async-timeout \
redis"

inherit rpm
