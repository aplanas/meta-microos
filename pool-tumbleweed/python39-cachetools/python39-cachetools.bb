SUMMARY = "Extensible memoizing collections and decorators"
DESCRIPTION = "This module provides various memoizing collections and decorators, \
including a variant of the Python 3 Standard Library `@lru_cache`_ \
function decorator."
LICENSE = "MIT"

PV = "5.3.1"

RPM_NAME = "python39-cachetools-5.3.1-1.2.noarch.rpm"
RPM_HASH = "0b56a5061de3c12e38bec28146203f62ae5d2a5fc3b37115dc4a63dfed1bc6b471021bac1bdf81acb52764810565d9f48fc1b619ad8abf16d71088f5d35a7e24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cachetools \
python39-cachetools \
python3dist-cachetools"

RDEPENDS:${PN} += "python-abi"

inherit rpm
