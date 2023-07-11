SUMMARY = "Multi key dictionary implementation"
DESCRIPTION = "Multi-key dict provides also extended interface for iterating over items and \
keys (e.g. by the key type), which might be useful when creating, e.g. \
dictionaries with index-name key pair allowing to iterate over items using \
either: names or indexes. \
It can be useful for many many other similar use-cases, and there is no limit \
to the number of keys used to map to the value."
LICENSE = "MIT"

PV = "2.0.3"

RPM_NAME = "python39-multi_key_dict-2.0.3-4.17.noarch.rpm"
RPM_HASH = "8f0618388db930525414a207e4d56c4d8625448015beeba7ae9a2bec3478fc4f4808238eed6be5d5ebd3a5a35433d8ca3f4c7d0e1258d6cbd69af5e3a10b62b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-multi-key-dict \
python39-multi-key-dict \
python3dist-multi-key-dict"

RDEPENDS:${PN} += "python-abi"

inherit rpm
