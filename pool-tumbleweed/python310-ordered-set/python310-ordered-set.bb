SUMMARY = "Custom MutableSet that remembers its order"
DESCRIPTION = "An OrderedSet is a custom MutableSet that remembers its order, so that every \
entry has an index that can be looked up."
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "python310-ordered-set-4.1.0-2.1.noarch.rpm"
RPM_HASH = "ecf6486b48c10b1d3514bff7a762bd5f6a6e315d7e1946a06f779c7709b9a0e6af947d94691b1c45a428226537c388bb200d098bb57879c235f0c5ff17ba59d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ordered-set \
python310-ordered-set \
python3dist-ordered-set"

RDEPENDS:${PN} += "python-abi"

inherit rpm
