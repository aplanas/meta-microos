SUMMARY = "Simple LRU cache for asyncio"
DESCRIPTION = "This package is a port of Python's built-in functools.lru_cache function for asyncio. \
To better handle async behaviour, it also ensures multiple concurrent calls will only \
result in 1 call to the wrapped function, with all awaits receiving the result of that \
call when it completes."
LICENSE = "MIT"

PV = "2.0.3"

RPM_NAME = "python39-async-lru-2.0.3-1.1.noarch.rpm"
RPM_HASH = "992edc1d0c50a5a314409463bf11c7b8fa0528886d08c22afa09137746e252a68772be0b711230d648f64e5bab65de804e2931c77c36b1bbb20a9a02ce9eb899"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-async-lru \
python39-async-lru \
python3dist-async-lru"

RDEPENDS:${PN} += "python-abi \
python39-typing-extensions"

inherit rpm
