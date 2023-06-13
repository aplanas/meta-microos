SUMMARY = "Tools to work with logging"
DESCRIPTION = "jaraco.logging Tools for working with logging."
LICENSE = "MIT"

PV = "3.1.2"

RPM_NAME = "python310-jaraco.logging-3.1.2-2.1.noarch.rpm"
RPM_HASH = "5c65a273fedced2d856ffa1331b647f5d24830700984f09a6d8438e2587d2ddb1d45b3751798fb1841c71e0858901d49fa7eb09560d6c6531c60558aaf730c38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jaraco.logging \
python3.10dist(jaraco.logging) \
python310-jaraco.logging \
python3dist(jaraco.logging)"

RDEPENDS:${PN} += "python(abi) \
python310-tempora"

inherit rpm
