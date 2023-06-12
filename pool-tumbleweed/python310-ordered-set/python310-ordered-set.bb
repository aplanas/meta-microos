SUMMARY = "Custom MutableSet that remembers its order"
DESCRIPTION = "An OrderedSet is a custom MutableSet that remembers its order, so that every \
entry has an index that can be looked up."
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "python310-ordered-set-4.1.0-1.3.noarch.rpm"
RPM_HASH = "6bbfe64c0589f6c5e905877dac850d64b4589b4ddc49b0c5d78d63e8cd9d26484a878a41096bf9f01062e8a1c7de54a46fe3f938c4190bf094e1cab773ed8c8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ordered-set \
python3.10dist(ordered-set) \
python310-ordered-set \
python3dist(ordered-set)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
