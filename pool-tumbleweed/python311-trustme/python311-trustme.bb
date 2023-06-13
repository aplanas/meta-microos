SUMMARY = "Fake CA provider for Python tests"
DESCRIPTION = "trustme is a Python package that provides a fake certificate \
authority (CA) that can be used to generate 'fake' TLS certs to use \
in tests. The CA and certificates are fake in the sense of \
https://martinfowler.com/bliki/TestDouble.html, that is, the trust \
circle of the CA is limited to the test environment."
LICENSE = "Apache-2.0 | MIT"

PV = "1.0.0"

RPM_NAME = "python311-trustme-1.0.0-1.1.noarch.rpm"
RPM_HASH = "62a3a9ee254f4b413514330df2e751a50b9a43111a24244fd519011fbb2aad6e2f7fbe88a9a9e01d4a2a502684f7a80f68e32335e3e26db05fb60fe6f7646e66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(trustme) \
python311-trustme \
python3dist(trustme)"

RDEPENDS:${PN} += "python(abi) \
python311-cryptography \
python311-idna"

inherit rpm
