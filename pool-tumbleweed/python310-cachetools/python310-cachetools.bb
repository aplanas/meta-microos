SUMMARY = "Extensible memoizing collections and decorators"
DESCRIPTION = "This module provides various memoizing collections and decorators, \
including a variant of the Python 3 Standard Library `@lru_cache`_ \
function decorator."
LICENSE = "MIT"

PV = "5.3.1"

RPM_NAME = "python310-cachetools-5.3.1-1.1.noarch.rpm"
RPM_HASH = "8ff89d1313ab3013d5e3e366a0f23e7c365c5c80c8a491ba779881f00d1089da63e2572b58ed183397cd74d97fee19eaf39d2cf9e1ea65cf33e01c244d568423"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cachetools \
python3.10dist(cachetools) \
python310-cachetools \
python3dist(cachetools)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
