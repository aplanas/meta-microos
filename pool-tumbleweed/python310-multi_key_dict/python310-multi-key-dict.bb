SUMMARY = "Multi key dictionary implementation"
DESCRIPTION = "Multi-key dict provides also extended interface for iterating over items and \
keys (e.g. by the key type), which might be useful when creating, e.g. \
dictionaries with index-name key pair allowing to iterate over items using \
either: names or indexes. \
It can be useful for many many other similar use-cases, and there is no limit \
to the number of keys used to map to the value."
LICENSE = "MIT"

PV = "2.0.3"

RPM_NAME = "python310-multi_key_dict-2.0.3-4.16.noarch.rpm"
RPM_HASH = "76d89cb1626d1a3c106451f127ffd048dce945768c58e27d7649bd6cdc8d8a709ad235400bbb3d2744761ecd85379d13f0a5f7ee8e1aa2a4d5873655d861dee9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-multi-key-dict \
python3.10dist-multi-key-dict \
python310-multi-key-dict \
python3dist-multi-key-dict"

RDEPENDS:${PN} += "python-abi"

inherit rpm
