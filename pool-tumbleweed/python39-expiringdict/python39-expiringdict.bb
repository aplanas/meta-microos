SUMMARY = "Dictionary with auto-expiring values for caching purposes"
DESCRIPTION = "The core of the library is ExpiringDict class which is an ordered \
dictionary with auto-expiring values for caching purposes. \
Expiration happens on any access, object is locked during cleanup \
from expired values. ExpiringDict can not store more than \
max_len elements - the oldest will be deleted."
LICENSE = "Apache-2.0"

PV = "1.2.2"

RPM_NAME = "python39-expiringdict-1.2.2-1.5.noarch.rpm"
RPM_HASH = "153c0ab5298972dda07972b2904111f7bab83061bbab7aa6a8f98e44a4a78c10c57f7fdead716ec71064588fe24dd67a2d4a0955b93bb4ecd6172686c2a0db05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-expiringdict \
python39-expiringdict \
python3dist-expiringdict"

RDEPENDS:${PN} += "python-abi \
python39-dill \
python39-typing"

inherit rpm
