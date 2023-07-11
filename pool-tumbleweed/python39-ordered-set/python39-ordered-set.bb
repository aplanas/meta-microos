SUMMARY = "Custom MutableSet that remembers its order"
DESCRIPTION = "An OrderedSet is a custom MutableSet that remembers its order, so that every \
entry has an index that can be looked up."
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "python39-ordered-set-4.1.0-2.1.noarch.rpm"
RPM_HASH = "014480e3b44ffd856e96e658903e9b48f59d735917af21fd9de62e0b090f6d2bc54d347930901be257077c1118b28e434d07d99c5f8ffe8c9307e0932b765032"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ordered-set \
python39-ordered-set \
python3dist-ordered-set"

RDEPENDS:${PN} += "python-abi"

inherit rpm
