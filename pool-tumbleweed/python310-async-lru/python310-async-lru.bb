SUMMARY = "Simple LRU cache for asyncio"
DESCRIPTION = "This package is a port of Python's built-in functools.lru_cache function for asyncio. \
To better handle async behaviour, it also ensures multiple concurrent calls will only \
result in 1 call to the wrapped function, with all awaits receiving the result of that \
call when it completes."
LICENSE = "MIT"

PV = "2.0.4"

RPM_NAME = "python310-async-lru-2.0.4-1.1.noarch.rpm"
RPM_HASH = "d8ac5bfe6c4dda2b2f469330d1055240e253e94936956dd126d1e31a64dafe9008785ed772068155fe749df298168808702a67b8c60294517874546b0b905841"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-async-lru \
python310-async-lru \
python3dist-async-lru"

RDEPENDS:${PN} += "python-abi \
python310-typing-extensions"

inherit rpm
