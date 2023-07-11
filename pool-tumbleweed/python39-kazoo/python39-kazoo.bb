SUMMARY = "Higher Level Zookeeper Client"
DESCRIPTION = "Implements a higher level API to Apache Zookeeper for Python clients."
LICENSE = "Apache-2.0"

PV = "2.9.0"

RPM_NAME = "python39-kazoo-2.9.0-1.4.noarch.rpm"
RPM_HASH = "500550c529975bd82f878661f4ce1d8e636679d9863b12fc34deb8bd1255c7eee3b1e7456a40932afdbca02b8c2e4bc29debcbecd62e1db2c98c6e07d7ed9b99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-kazoo \
python39-kazoo \
python3dist-kazoo"

RDEPENDS:${PN} += "python-abi \
python39-six"

inherit rpm
