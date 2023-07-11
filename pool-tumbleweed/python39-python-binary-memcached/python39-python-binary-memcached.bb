SUMMARY = "Access memcached via its binary protocol with SASL auth support"
DESCRIPTION = "A pure python module to access memcached via its binary protocol with SASL auth support"
LICENSE = "MIT"

PV = "0.31.2"

RPM_NAME = "python39-python-binary-memcached-0.31.2-1.3.noarch.rpm"
RPM_HASH = "efea45b881175b0f09c54d412cd3a2ec46356ee437389e2c77d1dd0d9343aaffbfb011d93b993216b6fca6782feb1bf30c150ac3ec212c4a9925238830c4f5ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-binary-memcached \
python39-python-binary-memcached \
python3dist-python-binary-memcached"

RDEPENDS:${PN} += "python-abi \
python39-six \
python39-uhashring"

inherit rpm
