SUMMARY = "Higher Level Zookeeper Client"
DESCRIPTION = "Implements a higher level API to Apache Zookeeper for Python clients."
LICENSE = "Apache-2.0"

PV = "2.9.0"

RPM_NAME = "python311-kazoo-2.9.0-1.4.noarch.rpm"
RPM_HASH = "8accdfcf310fbff1f3d2cc19792fa695986071224d1aa03a427b0fbefa5dfd3080a3538f44dd7034a6ac0d9f0afd6e9e6ec8fb769c589cbfc17cabe018e13609"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-kazoo \
python3.11dist-kazoo \
python311-kazoo \
python3dist-kazoo"

RDEPENDS:${PN} += "python-abi \
python311-six"

inherit rpm
