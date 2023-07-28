SUMMARY = "Simple LRU cache for asyncio"
DESCRIPTION = "This package is a port of Python's built-in functools.lru_cache function for asyncio. \
To better handle async behaviour, it also ensures multiple concurrent calls will only \
result in 1 call to the wrapped function, with all awaits receiving the result of that \
call when it completes."
LICENSE = "MIT"

PV = "2.0.3"

RPM_NAME = "python311-async-lru-2.0.3-1.1.noarch.rpm"
RPM_HASH = "d2b736f4249c2f1b7302eeea1d3d037c2f56c85ddc4480489912a7533f71823e7b812ed625d139a809642cbc447df388f1b083bf73812fc58253ab5d624e6c1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-async-lru \
python3.11dist-async-lru \
python311-async-lru \
python3dist-async-lru"

RDEPENDS:${PN} += "python-abi \
python311-typing-extensions"

inherit rpm
