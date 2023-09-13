SUMMARY = "Fake CA provider for Python tests"
DESCRIPTION = "trustme is a Python package that provides a fake certificate \
authority (CA) that can be used to generate 'fake' TLS certs to use \
in tests. The CA and certificates are fake in the sense of \
https://martinfowler.com/bliki/TestDouble.html, that is, the trust \
circle of the CA is limited to the test environment."
LICENSE = "Apache-2.0 | MIT"

PV = "1.1.0"

RPM_NAME = "python39-trustme-1.1.0-1.1.noarch.rpm"
RPM_HASH = "8f1d27e78ffb733565808d17536ead705b4997e4eb7569f29e5a8eee03367f3079209f40cda2a1fdb96549fef8edbeb6d0ebd8963d9c1850cbd6c5edaff772f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-trustme \
python39-trustme \
python3dist-trustme"

RDEPENDS:${PN} += "python-abi \
python39-cryptography \
python39-idna"

inherit rpm
