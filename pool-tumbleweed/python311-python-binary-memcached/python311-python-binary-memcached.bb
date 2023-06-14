SUMMARY = "Access memcached via its binary protocol with SASL auth support"
DESCRIPTION = "A pure python module to access memcached via its binary protocol with SASL auth support"
LICENSE = "MIT"

PV = "0.31.2"

RPM_NAME = "python311-python-binary-memcached-0.31.2-1.1.noarch.rpm"
RPM_HASH = "59f0ef2498b3dd9a5fe4da970415e11c34b80ba23e8698fe1301682ed64b9fed3c8d1ad06ab8f99f3e7926708df5d3d56d6d06ba66cd59a264edb61c904636a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-python-binary-memcached \
python311-python-binary-memcached \
python3dist-python-binary-memcached"

RDEPENDS:${PN} += "python-abi \
python311-six \
python311-uhashring"

inherit rpm
