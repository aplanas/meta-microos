SUMMARY = "Fake implementation of redis API for testing purposes"
DESCRIPTION = "Fake implementation of redis API for testing purposes."
LICENSE = "BSD-3-Clause & MIT"

PV = "2.18.0"

RPM_NAME = "python39-fakeredis-2.18.0-1.1.noarch.rpm"
RPM_HASH = "8a9a5b9c989b180d31f0033fb487c2e0e1395877db60a2aab6cf8b9203af67a3bee9c048897833adea2194d7405d59cbb01845120d7c49a0c715aec75fd67e63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-fakeredis \
python39-fakeredis \
python3dist-fakeredis"

RDEPENDS:${PN} += "python-abi \
python39-packaging \
python39-redis \
python39-sortedcontainers"

inherit rpm
