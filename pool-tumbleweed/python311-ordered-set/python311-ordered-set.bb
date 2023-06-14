SUMMARY = "Custom MutableSet that remembers its order"
DESCRIPTION = "An OrderedSet is a custom MutableSet that remembers its order, so that every \
entry has an index that can be looked up."
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "python311-ordered-set-4.1.0-1.3.noarch.rpm"
RPM_HASH = "f5e344b5d6387393fae9b444b119b5375946a72b7db27a7ba3a9082ceeb3ab2c421f710b6e867b805b079f70202ab8d7eefe0c287a36ec7343521677f3be3105"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-ordered-set \
python311-ordered-set \
python3dist-ordered-set"

RDEPENDS:${PN} += "python-abi"

inherit rpm
