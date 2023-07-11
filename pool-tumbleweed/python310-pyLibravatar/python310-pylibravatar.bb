SUMMARY = "Python module for Libravatar"
DESCRIPTION = "PyLibravatar is a module for using federated Libravatar \
avatar hosting service from within Python applications."
LICENSE = "MIT"

PV = "1.7"

RPM_NAME = "python310-pyLibravatar-1.7-3.14.noarch.rpm"
RPM_HASH = "d8bd8548ee2ca8da86de56aabf2bc754ff8818267f419b0a5118f8d66f1d7cc5cb5e726e8a2b40814632a979b00bc7c90fde383ede61babe268856a333121341"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pylibravatar \
python310-pyLibravatar \
python3dist-pylibravatar"

RDEPENDS:${PN} += "python-abi \
python310-py3dns"

inherit rpm
