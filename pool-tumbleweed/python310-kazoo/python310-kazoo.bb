SUMMARY = "Higher Level Zookeeper Client"
DESCRIPTION = "Implements a higher level API to Apache Zookeeper for Python clients."
LICENSE = "Apache-2.0"

PV = "2.9.0"

RPM_NAME = "python310-kazoo-2.9.0-1.4.noarch.rpm"
RPM_HASH = "d0c7afc8f3f4927ed985408729177faaf7a91372e5b5d71672e7f2b9d18ecf6f8729fd131cc83a60132af080d0ab53c9b10908e8dc11cdc62546403a8e842c33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-kazoo \
python310-kazoo \
python3dist-kazoo"

RDEPENDS:${PN} += "python-abi \
python310-six"

inherit rpm
