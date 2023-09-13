SUMMARY = "Fake CA provider for Python tests"
DESCRIPTION = "trustme is a Python package that provides a fake certificate \
authority (CA) that can be used to generate 'fake' TLS certs to use \
in tests. The CA and certificates are fake in the sense of \
https://martinfowler.com/bliki/TestDouble.html, that is, the trust \
circle of the CA is limited to the test environment."
LICENSE = "Apache-2.0 | MIT"

PV = "1.1.0"

RPM_NAME = "python311-trustme-1.1.0-1.1.noarch.rpm"
RPM_HASH = "a2fc61353adae1ca5df64dd9c96a275ede895a9940c5a4fb6d6968be16c25776b914285443ca2b518a7faf0e70848049068c91859dad1d23872cd7329a592b42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-trustme \
python3.11dist-trustme \
python311-trustme \
python3dist-trustme"

RDEPENDS:${PN} += "python-abi \
python311-cryptography \
python311-idna"

inherit rpm
