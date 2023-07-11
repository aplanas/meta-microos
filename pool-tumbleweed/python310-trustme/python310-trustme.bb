SUMMARY = "Fake CA provider for Python tests"
DESCRIPTION = "trustme is a Python package that provides a fake certificate \
authority (CA) that can be used to generate 'fake' TLS certs to use \
in tests. The CA and certificates are fake in the sense of \
https://martinfowler.com/bliki/TestDouble.html, that is, the trust \
circle of the CA is limited to the test environment."
LICENSE = "Apache-2.0 | MIT"

PV = "1.0.0"

RPM_NAME = "python310-trustme-1.0.0-1.3.noarch.rpm"
RPM_HASH = "a3b5eb1ad17c6733b2bfbe80e9a2f5e3f1074673f5bf5caccd99c5843b3cd017291700b4c0989a587eca963a67735325396190695ca5e5c4e612957bd63727eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-trustme \
python310-trustme \
python3dist-trustme"

RDEPENDS:${PN} += "python-abi \
python310-cryptography \
python310-idna"

inherit rpm
