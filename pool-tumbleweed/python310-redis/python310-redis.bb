SUMMARY = "Python client for Redis key-value store"
DESCRIPTION = "The Python interface to the Redis key-value store."
LICENSE = "MIT"

PV = "4.5.5"

RPM_NAME = "python310-redis-4.5.5-1.4.noarch.rpm"
RPM_HASH = "30fc8209a1cf76aaf53e8c793516a16b35ca03a19822e36f96b27b5fe8e71aff44803021c7f750cac3fef4c72f90fee108608bdc954b35d9f59e388937025698"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-redis \
python310-redis \
python3dist-redis"

RDEPENDS:${PN} += "python-abi \
python310-async-timeout \
redis"

inherit rpm
