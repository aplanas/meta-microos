SUMMARY = "A pure Python implementation of the Cassowary constraint solving algorithm"
DESCRIPTION = "A pure Python implementation of the Cassowary constraint-solving algorithm. \
Cassowary is the algorithm that forms the core of the OS X and iOS visual \
layout mechanism."
LICENSE = "BSD-3-Clause"

PV = "0.5.2"

RPM_NAME = "python39-cassowary-0.5.2-2.10.noarch.rpm"
RPM_HASH = "5785b25cd38d8f233644ae5a2ce164a9dceeecdc23fbf74461370ce9ab9a5a871a2195debd31f10fccdc2c34873be80a3db0200a6cc96c88a305e1cae2f90ff2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cassowary \
python39-cassowary \
python3dist-cassowary"

RDEPENDS:${PN} += "python-abi"

inherit rpm
