SUMMARY = "Extensible memoizing collections and decorators"
DESCRIPTION = "This module provides various memoizing collections and decorators, \
including a variant of the Python 3 Standard Library `@lru_cache`_ \
function decorator."
LICENSE = "MIT"

PV = "5.3.1"

RPM_NAME = "python311-cachetools-5.3.1-1.1.noarch.rpm"
RPM_HASH = "982011162baebc43944809178fc7859a4f2eb022b31ea946fa5a0fbee50a14b19198ac0efdfd8f5e4d7992683231c3a1353174460ed2340d86301fa3e296f3e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(cachetools) \
python311-cachetools \
python3dist(cachetools)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
