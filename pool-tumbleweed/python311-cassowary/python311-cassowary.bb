SUMMARY = "A pure Python implementation of the Cassowary constraint solving algorithm"
DESCRIPTION = "A pure Python implementation of the Cassowary constraint-solving algorithm. \
Cassowary is the algorithm that forms the core of the OS X and iOS visual \
layout mechanism."
LICENSE = "BSD-3-Clause"

PV = "0.5.2"

RPM_NAME = "python311-cassowary-0.5.2-2.10.noarch.rpm"
RPM_HASH = "336b5a2f6d217d58404ba292060b6a4f8b55a24eb69202bf6250379ee7d080eb383d9dc73f82eb708608b0365292bb4d0982b41db519ca0b3c020e4f4b1a34b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cassowary \
python3.11dist-cassowary \
python311-cassowary \
python3dist-cassowary"

RDEPENDS:${PN} += "python-abi"

inherit rpm
