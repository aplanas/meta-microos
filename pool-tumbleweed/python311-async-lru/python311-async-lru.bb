SUMMARY = "Simple LRU cache for asyncio"
DESCRIPTION = "This package is a port of Python's built-in functools.lru_cache function for asyncio. \
To better handle async behaviour, it also ensures multiple concurrent calls will only \
result in 1 call to the wrapped function, with all awaits receiving the result of that \
call when it completes."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python311-async-lru-2.0.2-1.3.noarch.rpm"
RPM_HASH = "5e886261370ed3a017e2f65ffb3986eebd904a6660c680bb388580d27f6dead9a9ba4566649e03adcae838b207ba0f927703e2ec1e0888a460eef739fa07c811"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-async-lru \
python3.11dist-async-lru \
python311-async-lru \
python3dist-async-lru"

RDEPENDS:${PN} += "python-abi \
python311-typing-extensions"

inherit rpm
