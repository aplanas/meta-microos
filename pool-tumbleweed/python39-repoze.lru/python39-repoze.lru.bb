SUMMARY = "A tiny LRU cache implementation and decorator"
DESCRIPTION = "repoze.lru is a LRU (least recently used) cache implementation.  Keys and \
values that are not used frequently will be evicted from the cache faster \
than keys and values that are used frequently.  It works under Python 2.5, \
Python 2.6, Python 2.7, and Python 3.2."
LICENSE = "SUSE-Repoze"

PV = "0.7"

RPM_NAME = "python39-repoze.lru-0.7-3.2.noarch.rpm"
RPM_HASH = "3f6423f5ccfe3b71595c47e64a6bc9069f0e536ed8135d05ee0cbc4f1f6c1688daaaedff68ffbdcb307bea1cfc57afbdcd483bc33399708a0e5e1b5832dc5731"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-repoze.lru \
python39-repoze.lru \
python3dist-repoze.lru"

RDEPENDS:${PN} += "python-abi"

inherit rpm
