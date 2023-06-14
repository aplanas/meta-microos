SUMMARY = "Higher Level Zookeeper Client"
DESCRIPTION = "Implements a higher level API to Apache Zookeeper for Python clients."
LICENSE = "Apache-2.0"

PV = "2.9.0"

RPM_NAME = "python311-kazoo-2.9.0-1.3.noarch.rpm"
RPM_HASH = "bb74a1271309675a593ec6638876ab6cfc77e3e53b0848a7e47d7a681feb9098daa02a1422ddd60a8fad9b3c8bfb66199f8b053e7252642a4eea957fd0473096"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-kazoo \
python311-kazoo \
python3dist-kazoo"

RDEPENDS:${PN} += "python-abi \
python311-six"

inherit rpm
