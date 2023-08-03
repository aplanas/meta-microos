SUMMARY = "Fake implementation of redis API for testing purposes"
DESCRIPTION = "Fake implementation of redis API for testing purposes."
LICENSE = "BSD-3-Clause & MIT"

PV = "2.17.0"

RPM_NAME = "python310-fakeredis-2.17.0-1.1.noarch.rpm"
RPM_HASH = "fac9f43ae99d6b7d9b7049b7e4c3de0537a8ed2c8446546c03ad2605f3cb33ae0f9abbaa2f67376b55f79aa621e190a9dd60192c69c6bc36ab2e81079714d337"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-fakeredis \
python310-fakeredis \
python3dist-fakeredis"

RDEPENDS:${PN} += "python-abi \
python310-packaging \
python310-redis \
python310-sortedcontainers"

inherit rpm
