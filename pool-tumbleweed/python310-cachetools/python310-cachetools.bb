SUMMARY = "Extensible memoizing collections and decorators"
DESCRIPTION = "This module provides various memoizing collections and decorators, \
including a variant of the Python 3 Standard Library `@lru_cache`_ \
function decorator."
LICENSE = "MIT"

PV = "5.3.1"

RPM_NAME = "python310-cachetools-5.3.1-1.2.noarch.rpm"
RPM_HASH = "bde754c0d014be8a081626344b461d354816a3342da6842fdbf66f8a3fb1b90f9002fbc8dfb6a26c000af34e2f9e8ee018867da71a48f0d43d5211fdd38aec78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cachetools \
python310-cachetools \
python3dist-cachetools"

RDEPENDS:${PN} += "python-abi"

inherit rpm
