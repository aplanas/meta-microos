SUMMARY = "Fake CA provider for Python tests"
DESCRIPTION = "trustme is a Python package that provides a fake certificate \
authority (CA) that can be used to generate 'fake' TLS certs to use \
in tests. The CA and certificates are fake in the sense of \
https://martinfowler.com/bliki/TestDouble.html, that is, the trust \
circle of the CA is limited to the test environment."
LICENSE = "Apache-2.0 | MIT"

PV = "1.0.0"

RPM_NAME = "python39-trustme-1.0.0-1.3.noarch.rpm"
RPM_HASH = "22c0d64a7bd2d58bdd706ff8fdb085e3c1889bf88511fb6036b94f6eb040c5e90187c26ba6da0ac9c3309f9297194d6683a359257969dcf58d97acc534e293a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-trustme \
python39-trustme \
python3dist-trustme"

RDEPENDS:${PN} += "python-abi \
python39-cryptography \
python39-idna"

inherit rpm
