SUMMARY = "Simple LRU cache for asyncio"
DESCRIPTION = "This package is a port of Python's built-in functools.lru_cache function for asyncio. \
To better handle async behaviour, it also ensures multiple concurrent calls will only \
result in 1 call to the wrapped function, with all awaits receiving the result of that \
call when it completes."
LICENSE = "MIT"

PV = "2.0.4"

RPM_NAME = "python311-async-lru-2.0.4-1.1.noarch.rpm"
RPM_HASH = "6f649a1a696a4cd3aa0cdbdff7dacc98db5714bb2654c508bbe13a70d4b85e6e96d1d8dcac855ff2ca5dc8d195371584158bb0a201f3eb6a35d9365504be33fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-async-lru \
python3.11dist-async-lru \
python311-async-lru \
python3dist-async-lru"

RDEPENDS:${PN} += "python-abi \
python311-typing-extensions"

inherit rpm
