SUMMARY = "Dictionary with auto-expiring values for caching purposes"
DESCRIPTION = "The core of the library is ExpiringDict class which is an ordered \
dictionary with auto-expiring values for caching purposes. \
Expiration happens on any access, object is locked during cleanup \
from expired values. ExpiringDict can not store more than \
max_len elements - the oldest will be deleted."
LICENSE = "Apache-2.0"

PV = "1.2.2"

RPM_NAME = "python310-expiringdict-1.2.2-1.5.noarch.rpm"
RPM_HASH = "b70e56e9a51f55eea4656e0f99c017aae12b9119bd654d2b3d783b6782a0a3656d37b9b8397829b76644daefa9b9d16b45b04fd1c697b9f72d1505de4e76b8ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-expiringdict \
python310-expiringdict \
python3dist-expiringdict"

RDEPENDS:${PN} += "python-abi \
python310-dill \
python310-typing"

inherit rpm
