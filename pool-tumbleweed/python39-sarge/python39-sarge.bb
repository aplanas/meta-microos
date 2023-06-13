SUMMARY = "Command pipelines for python"
DESCRIPTION = "A wrapper for subprocess which provides command pipeline functionality."
LICENSE = "BSD-3-Clause"

PV = "0.1.7.post1"

RPM_NAME = "python39-sarge-0.1.7.post1-1.3.noarch.rpm"
RPM_HASH = "fc22845a72083b2d37cd6fe0bc1bc5905f51e1c0b52b4a1b97d519d9b5788ade0efd9228e8e9f14e353fe99ad762a0e502d831fe10818d441fb51a1d5b48cfba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sarge) \
python39-sarge \
python3dist(sarge)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
