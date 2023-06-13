SUMMARY = "Tools to work with classes"
DESCRIPTION = "jaraco.classes Tools for working with classes."
LICENSE = "MIT"

PV = "3.2.3"

RPM_NAME = "python39-jaraco.classes-3.2.3-2.1.noarch.rpm"
RPM_HASH = "1c94ec01665c1dfac84cd8b15cf0a936c90cdc8b3f21836934a0f4547f1dd002c6307e0ed746f3c451da4c66c241f7a27ef6ee66fe83cc9d67d1fff7787503b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jaraco.classes) \
python39-jaraco.classes \
python3dist(jaraco.classes)"

RDEPENDS:${PN} += "python(abi) \
python39-more-itertools"

inherit rpm
