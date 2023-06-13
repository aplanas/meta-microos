SUMMARY = "Higher Level Zookeeper Client"
DESCRIPTION = "Implements a higher level API to Apache Zookeeper for Python clients."
LICENSE = "Apache-2.0"

PV = "2.9.0"

RPM_NAME = "python39-kazoo-2.9.0-1.3.noarch.rpm"
RPM_HASH = "b60794d23d63e7ac002758d53b65bbdbb1914f2fa67776f981466406e7f52fe0c9931852c87967713587d5fbe956c4ec36cf69d173457b75e2f2261500f3622b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(kazoo) \
python39-kazoo \
python3dist(kazoo)"

RDEPENDS:${PN} += "python(abi) \
python39-six"

inherit rpm
