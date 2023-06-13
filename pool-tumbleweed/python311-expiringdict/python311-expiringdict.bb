SUMMARY = "Dictionary with auto-expiring values for caching purposes"
DESCRIPTION = "The core of the library is ExpiringDict class which is an ordered \
dictionary with auto-expiring values for caching purposes. \
Expiration happens on any access, object is locked during cleanup \
from expired values. ExpiringDict can not store more than \
max_len elements - the oldest will be deleted."
LICENSE = "Apache-2.0"

PV = "1.2.2"

RPM_NAME = "python311-expiringdict-1.2.2-1.3.noarch.rpm"
RPM_HASH = "f29969ff7e42461eac54e5d80307a4b224eb72cc843e014185da6d779d454acc7ffc861c3f550ca22dc42c22160b6ed98d9d78f64520785701d8d562822a3b86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(expiringdict) \
python311-expiringdict \
python3dist(expiringdict)"

RDEPENDS:${PN} += "python(abi) \
python311-dill \
python311-typing"

inherit rpm
