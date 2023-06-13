SUMMARY = "A pure Python implementation of the Cassowary constraint solving algorithm"
DESCRIPTION = "A pure Python implementation of the Cassowary constraint-solving algorithm. \
Cassowary is the algorithm that forms the core of the OS X and iOS visual \
layout mechanism."
LICENSE = "BSD-3-Clause"

PV = "0.5.2"

RPM_NAME = "python39-cassowary-0.5.2-2.8.noarch.rpm"
RPM_HASH = "14fd4a90dd49c453b22e3f7de92a8305f9cf876b101e0f4ed7baa90ead2e820467666c14a25d01af0c762223efa3809becbd55a72677f60962c2c49903f6d718"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(cassowary) \
python39-cassowary \
python3dist(cassowary)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
