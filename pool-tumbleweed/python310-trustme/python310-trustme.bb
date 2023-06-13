SUMMARY = "Fake CA provider for Python tests"
DESCRIPTION = "trustme is a Python package that provides a fake certificate \
authority (CA) that can be used to generate 'fake' TLS certs to use \
in tests. The CA and certificates are fake in the sense of \
https://martinfowler.com/bliki/TestDouble.html, that is, the trust \
circle of the CA is limited to the test environment."
LICENSE = "Apache-2.0 | MIT"

PV = "1.0.0"

RPM_NAME = "python310-trustme-1.0.0-1.1.noarch.rpm"
RPM_HASH = "19f87301b4f45de1b2ff59b16550a8c845cc421cd021f30a1b3a42535ce867fb5acc365607c5f8452e068aaf0505d2ecd5984c2ec36be3d6ffbb6a80d391e46f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-trustme \
python3.10dist(trustme) \
python310-trustme \
python3dist(trustme)"

RDEPENDS:${PN} += "python(abi) \
python310-cryptography \
python310-idna"

inherit rpm
