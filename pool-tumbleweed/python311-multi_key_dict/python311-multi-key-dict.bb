SUMMARY = "Multi key dictionary implementation"
DESCRIPTION = "Multi-key dict provides also extended interface for iterating over items and \
keys (e.g. by the key type), which might be useful when creating, e.g. \
dictionaries with index-name key pair allowing to iterate over items using \
either: names or indexes. \
It can be useful for many many other similar use-cases, and there is no limit \
to the number of keys used to map to the value."
LICENSE = "MIT"

PV = "2.0.3"

RPM_NAME = "python311-multi_key_dict-2.0.3-4.17.noarch.rpm"
RPM_HASH = "d1435c600bdaaa3a3c1ae33cdb8c8e95d914fdc5096f5592263e5723ac9c8787793d7ed3380a40c116a99853545dbc69f91f092cef71779ec7673b48a61a54de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-multi-key-dict \
python3.11dist-multi-key-dict \
python311-multi-key-dict \
python3dist-multi-key-dict"

RDEPENDS:${PN} += "python-abi"

inherit rpm
