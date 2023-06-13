SUMMARY = "Access memcached via its binary protocol with SASL auth support"
DESCRIPTION = "A pure python module to access memcached via its binary protocol with SASL auth support"
LICENSE = "MIT"

PV = "0.31.2"

RPM_NAME = "python39-python-binary-memcached-0.31.2-1.1.noarch.rpm"
RPM_HASH = "c51951139bb6871ddd43205a1bf68c799a36d7aa293499c9d8d42d25552a5eedb104d494294e57f9328a60830383ec25cbfbee42016ed2ea60a526c30f24a33b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python-binary-memcached) \
python39-python-binary-memcached \
python3dist(python-binary-memcached)"

RDEPENDS:${PN} += "python(abi) \
python39-six \
python39-uhashring"

inherit rpm
