SUMMARY = "Custom MutableSet that remembers its order"
DESCRIPTION = "An OrderedSet is a custom MutableSet that remembers its order, so that every \
entry has an index that can be looked up."
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "python311-ordered-set-4.1.0-2.1.noarch.rpm"
RPM_HASH = "66f75cc5336e610b05675243e177d74b91961e72e90628929fd59437ee773a2a0119adfac6cda289d62fe36e51f07d021b79e32aee41593aa88be0cbf364f48c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ordered-set \
python3.11dist-ordered-set \
python311-ordered-set \
python3dist-ordered-set"

RDEPENDS:${PN} += "python-abi"

inherit rpm
