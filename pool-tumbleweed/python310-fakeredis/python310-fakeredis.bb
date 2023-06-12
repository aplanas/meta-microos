SUMMARY = "Fake implementation of redis API for testing purposes"
DESCRIPTION = "Fake implementation of redis API for testing purposes."
LICENSE = "BSD-3-Clause & MIT"

PV = "2.13.0"

RPM_NAME = "python310-fakeredis-2.13.0-1.1.noarch.rpm"
RPM_HASH = "f463a12d8523fd367776163f8763dddbbda850fa1380857069ee02ee7b9fe5f1f6d4b19eba93fc92200f69e76549aa5b4c0ac4a55d36b3425ca56ada17419627"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fakeredis \
python3.10dist(fakeredis) \
python310-fakeredis \
python3dist(fakeredis)"
RDEPENDS:${PN} += "python(abi) \
python310-redis \
python310-sortedcontainers"

inherit rpm
