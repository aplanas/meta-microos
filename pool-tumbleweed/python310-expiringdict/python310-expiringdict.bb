SUMMARY = "Dictionary with auto-expiring values for caching purposes"
DESCRIPTION = "The core of the library is ExpiringDict class which is an ordered \
dictionary with auto-expiring values for caching purposes. \
Expiration happens on any access, object is locked during cleanup \
from expired values. ExpiringDict can not store more than \
max_len elements - the oldest will be deleted."
LICENSE = "Apache-2.0"

PV = "1.2.2"

RPM_NAME = "python310-expiringdict-1.2.2-1.3.noarch.rpm"
RPM_HASH = "c8b946d0afb40f49aa7d78f8f82235e99adb643c6f1fec685b7aef35892338d9eb64e5257a7ca0ec5897826d8ac5d12e4ee8c0fdaa5f88a401eeaa63554934df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-expiringdict \
python3.10dist(expiringdict) \
python310-expiringdict \
python3dist(expiringdict)"
RDEPENDS:${PN} += "python(abi) \
python310-dill \
python310-typing"

inherit rpm
