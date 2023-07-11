SUMMARY = "Fake CA provider for Python tests"
DESCRIPTION = "trustme is a Python package that provides a fake certificate \
authority (CA) that can be used to generate 'fake' TLS certs to use \
in tests. The CA and certificates are fake in the sense of \
https://martinfowler.com/bliki/TestDouble.html, that is, the trust \
circle of the CA is limited to the test environment."
LICENSE = "Apache-2.0 | MIT"

PV = "1.0.0"

RPM_NAME = "python311-trustme-1.0.0-1.3.noarch.rpm"
RPM_HASH = "510c28de1ae3d9c5290b3e342193e4b39671fca5e9ccfcb3294fa5be03211ff6303c874478a15ecfe1dd97c80aedb18b8253c5fd82f7316ed0fbb84520a83e01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-trustme \
python3.11dist-trustme \
python311-trustme \
python3dist-trustme"

RDEPENDS:${PN} += "python-abi \
python311-cryptography \
python311-idna"

inherit rpm
