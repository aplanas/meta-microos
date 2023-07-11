SUMMARY = "Dictionary with auto-expiring values for caching purposes"
DESCRIPTION = "The core of the library is ExpiringDict class which is an ordered \
dictionary with auto-expiring values for caching purposes. \
Expiration happens on any access, object is locked during cleanup \
from expired values. ExpiringDict can not store more than \
max_len elements - the oldest will be deleted."
LICENSE = "Apache-2.0"

PV = "1.2.2"

RPM_NAME = "python311-expiringdict-1.2.2-1.5.noarch.rpm"
RPM_HASH = "f78a60a8c93cfb449082f68729a117bc60c261657dafc68673221fce3cc842da651d4dedaba4a6fc3eef602725a1c567a69fcdd0a525d9fcd84da288555faa69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-expiringdict \
python3.11dist-expiringdict \
python311-expiringdict \
python3dist-expiringdict"

RDEPENDS:${PN} += "python-abi \
python311-dill \
python311-typing"

inherit rpm
