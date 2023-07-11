SUMMARY = "A tiny LRU cache implementation and decorator"
DESCRIPTION = "repoze.lru is a LRU (least recently used) cache implementation.  Keys and \
values that are not used frequently will be evicted from the cache faster \
than keys and values that are used frequently.  It works under Python 2.5, \
Python 2.6, Python 2.7, and Python 3.2."
LICENSE = "SUSE-Repoze"

PV = "0.7"

RPM_NAME = "python311-repoze.lru-0.7-3.2.noarch.rpm"
RPM_HASH = "6a86862c56bf71d0ba21ccd88b5c6bcd1772041f0e37d0f64648477769ceedb135eb7ce59ceb3c561d4c23bc795cda15cdf5e6b84243b8906a1390088b1cae8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-repoze.lru \
python3.11dist-repoze.lru \
python311-repoze.lru \
python3dist-repoze.lru"

RDEPENDS:${PN} += "python-abi"

inherit rpm
