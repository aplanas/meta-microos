SUMMARY = "Extensible memoizing collections and decorators"
DESCRIPTION = "This module provides various memoizing collections and decorators, \
including a variant of the Python 3 Standard Library `@lru_cache`_ \
function decorator."
LICENSE = "MIT"

PV = "5.3.1"

RPM_NAME = "python311-cachetools-5.3.1-1.2.noarch.rpm"
RPM_HASH = "2a9aef18ee4cd03a2bb3d87cc3a60296579d8f11e97cb2767ed6160898ac110131e9b8b193eb2ba79924a8720217e194cb4514f9a2176179e506b5b021ce2c1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cachetools \
python3.11dist-cachetools \
python311-cachetools \
python3dist-cachetools"

RDEPENDS:${PN} += "python-abi"

inherit rpm
