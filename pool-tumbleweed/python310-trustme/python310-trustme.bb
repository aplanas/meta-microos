SUMMARY = "Fake CA provider for Python tests"
DESCRIPTION = "trustme is a Python package that provides a fake certificate \
authority (CA) that can be used to generate 'fake' TLS certs to use \
in tests. The CA and certificates are fake in the sense of \
https://martinfowler.com/bliki/TestDouble.html, that is, the trust \
circle of the CA is limited to the test environment."
LICENSE = "Apache-2.0 | MIT"

PV = "1.1.0"

RPM_NAME = "python310-trustme-1.1.0-1.1.noarch.rpm"
RPM_HASH = "a7c7de200b0974c5d74bd966fa104c53b5af6359cb1033ee36fa26d00fa591e9383bcc10a9b8b65dc78e29b7ceb1744b18f17f0146eb582872d215accf87a999"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-trustme \
python310-trustme \
python3dist-trustme"

RDEPENDS:${PN} += "python-abi \
python310-cryptography \
python310-idna"

inherit rpm
