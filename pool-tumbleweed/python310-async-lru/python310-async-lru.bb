SUMMARY = "Simple LRU cache for asyncio"
DESCRIPTION = "This package is a port of Python's built-in functools.lru_cache function for asyncio. \
To better handle async behaviour, it also ensures multiple concurrent calls will only \
result in 1 call to the wrapped function, with all awaits receiving the result of that \
call when it completes."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python310-async-lru-2.0.2-1.3.noarch.rpm"
RPM_HASH = "52de8e100e4b399fb0e643dc9fa40cd6a48676266116f3210e0b8fb0e2a9caad72975362a1b2cf9fe5506ad7b8ce197597c00e9702deff1589eda716d5c1e173"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-async-lru \
python310-async-lru \
python3dist-async-lru"

RDEPENDS:${PN} += "python-abi \
python310-typing-extensions"

inherit rpm
