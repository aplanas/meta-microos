SUMMARY = "Tools to work with classes"
DESCRIPTION = "jaraco.classes Tools for working with classes."
LICENSE = "MIT"

PV = "3.2.3"

RPM_NAME = "python310-jaraco.classes-3.2.3-2.1.noarch.rpm"
RPM_HASH = "bc00b71f25a965a90e187173fcbaa4c6e5339da98c477e63cc808e8d8f04e596fc22be8220be3f1448650615b02eab25911b80fd8a111630ae0bbc925104be10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jaraco.classes \
python3.10dist(jaraco.classes) \
python310-jaraco.classes \
python3dist(jaraco.classes)"
RDEPENDS:${PN} += "python(abi) \
python310-more-itertools"

inherit rpm
