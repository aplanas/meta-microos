SUMMARY = "Simple LRU cache for asyncio"
DESCRIPTION = "This package is a port of Python's built-in functools.lru_cache function for asyncio. \
To better handle async behaviour, it also ensures multiple concurrent calls will only \
result in 1 call to the wrapped function, with all awaits receiving the result of that \
call when it completes."
LICENSE = "MIT"

PV = "2.0.3"

RPM_NAME = "python310-async-lru-2.0.3-1.1.noarch.rpm"
RPM_HASH = "efb094bdc4ce6bdcc22c496b09c6ccc6aee1ca4be93ca84969334af1a644ed48c01cc1a4773d6883eaedd6e2e1fb3d2b6a8520a7c740a0f6782dfe5edbdfa7d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-async-lru \
python310-async-lru \
python3dist-async-lru"

RDEPENDS:${PN} += "python-abi \
python310-typing-extensions"

inherit rpm
