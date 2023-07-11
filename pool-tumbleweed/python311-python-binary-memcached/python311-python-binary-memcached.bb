SUMMARY = "Access memcached via its binary protocol with SASL auth support"
DESCRIPTION = "A pure python module to access memcached via its binary protocol with SASL auth support"
LICENSE = "MIT"

PV = "0.31.2"

RPM_NAME = "python311-python-binary-memcached-0.31.2-1.3.noarch.rpm"
RPM_HASH = "5ab1e3718c290404c0a4516a494803341442729040278ae9755a302ddc26147294e53f691fccea35bc6b99c53a9174d16a60a425872cf65923b235ab7c3945c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-binary-memcached \
python3.11dist-python-binary-memcached \
python311-python-binary-memcached \
python3dist-python-binary-memcached"

RDEPENDS:${PN} += "python-abi \
python311-six \
python311-uhashring"

inherit rpm
