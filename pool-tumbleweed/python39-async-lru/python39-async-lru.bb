SUMMARY = "Simple LRU cache for asyncio"
DESCRIPTION = "This package is a port of Python's built-in functools.lru_cache function for asyncio. \
To better handle async behaviour, it also ensures multiple concurrent calls will only \
result in 1 call to the wrapped function, with all awaits receiving the result of that \
call when it completes."
LICENSE = "MIT"

PV = "2.0.4"

RPM_NAME = "python39-async-lru-2.0.4-1.1.noarch.rpm"
RPM_HASH = "d679e213c9aba0c15a82fe0f40d0e31b4b8d16aa9286c60391dbe4b759c2fe12f99328d6fd4d7177eca9d1ca64feb7cbe7904d6e01760a6a62a8b74292be15bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-async-lru \
python39-async-lru \
python3dist-async-lru"

RDEPENDS:${PN} += "python-abi \
python39-typing-extensions"

inherit rpm
