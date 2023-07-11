SUMMARY = "Access memcached via its binary protocol with SASL auth support"
DESCRIPTION = "A pure python module to access memcached via its binary protocol with SASL auth support"
LICENSE = "MIT"

PV = "0.31.2"

RPM_NAME = "python310-python-binary-memcached-0.31.2-1.3.noarch.rpm"
RPM_HASH = "30090fe5d8a38f109111bbb3aa611bde91bbf18e5963dc59f18ca5a8da24001770db2b777cc9c3ff3165f519363c780f1753d42e894415a1a5b4f9ef985d33ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-binary-memcached \
python310-python-binary-memcached \
python3dist-python-binary-memcached"

RDEPENDS:${PN} += "python-abi \
python310-six \
python310-uhashring"

inherit rpm
