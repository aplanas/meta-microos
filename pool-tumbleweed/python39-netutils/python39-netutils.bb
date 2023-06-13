SUMMARY = "Common helper functions useful in network automation"
DESCRIPTION = "A Python library that is a collection of objects for common network automation tasks."
LICENSE = "Apache-2.0"

PV = "1.4.1"

RPM_NAME = "python39-netutils-1.4.1-1.1.noarch.rpm"
RPM_HASH = "99e30b6ead47d35e480f63cdb106e3f71580c1fff506328582b477d9c987780ffc027c3fd4d90b99ea00aa1e5a477a30dbb8d82aa853ed58d73eee436cbbd05e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(netutils) \
python39-netutils \
python3dist(netutils)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
