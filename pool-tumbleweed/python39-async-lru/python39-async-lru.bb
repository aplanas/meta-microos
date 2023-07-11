SUMMARY = "Simple LRU cache for asyncio"
DESCRIPTION = "This package is a port of Python's built-in functools.lru_cache function for asyncio. \
To better handle async behaviour, it also ensures multiple concurrent calls will only \
result in 1 call to the wrapped function, with all awaits receiving the result of that \
call when it completes."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python39-async-lru-2.0.2-1.3.noarch.rpm"
RPM_HASH = "3d3c65dad0fda62aad7dbdae35edc5746f5deea75bada51e937623e0cc98dbdfa8132e35c4527220e0ef2f355a8a810c77a2f94c9f5a48412ed009d73503be07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-async-lru \
python39-async-lru \
python3dist-async-lru"

RDEPENDS:${PN} += "python-abi \
python39-typing-extensions"

inherit rpm
