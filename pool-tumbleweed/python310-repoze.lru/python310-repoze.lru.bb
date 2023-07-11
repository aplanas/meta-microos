SUMMARY = "A tiny LRU cache implementation and decorator"
DESCRIPTION = "repoze.lru is a LRU (least recently used) cache implementation.  Keys and \
values that are not used frequently will be evicted from the cache faster \
than keys and values that are used frequently.  It works under Python 2.5, \
Python 2.6, Python 2.7, and Python 3.2."
LICENSE = "SUSE-Repoze"

PV = "0.7"

RPM_NAME = "python310-repoze.lru-0.7-3.2.noarch.rpm"
RPM_HASH = "ef7002cc01a34f3125395f55e0120bd3a615710327447e1d31d1e6b3f845af81a37f5d3d437d0e8cb01ba9789db128fd8d275fa0d1bc621f3a32e28ced52d8d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-repoze.lru \
python310-repoze.lru \
python3dist-repoze.lru"

RDEPENDS:${PN} += "python-abi"

inherit rpm
