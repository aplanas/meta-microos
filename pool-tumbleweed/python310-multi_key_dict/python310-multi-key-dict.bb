SUMMARY = "Multi key dictionary implementation"
DESCRIPTION = "Multi-key dict provides also extended interface for iterating over items and \
keys (e.g. by the key type), which might be useful when creating, e.g. \
dictionaries with index-name key pair allowing to iterate over items using \
either: names or indexes. \
It can be useful for many many other similar use-cases, and there is no limit \
to the number of keys used to map to the value."
LICENSE = "MIT"

PV = "2.0.3"

RPM_NAME = "python310-multi_key_dict-2.0.3-4.17.noarch.rpm"
RPM_HASH = "e5bffb55530f907790d083a21e5f2bbfd84cb0cc8015508ddfa504314563ab516126af1ecb9cff80d3cf59bdb792c472d36a23f34a5edc7a7867a9ee795ba737"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-multi-key-dict \
python310-multi-key-dict \
python3dist-multi-key-dict"

RDEPENDS:${PN} += "python-abi"

inherit rpm
