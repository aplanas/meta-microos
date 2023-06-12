SUMMARY = "Command pipelines for python"
DESCRIPTION = "A wrapper for subprocess which provides command pipeline functionality."
LICENSE = "BSD-3-Clause"

PV = "0.1.7.post1"

RPM_NAME = "python310-sarge-0.1.7.post1-1.3.noarch.rpm"
RPM_HASH = "2900e2bca40eca567349fa53f96822ce7e08f5ea2521f896d4a59c0f58e5e917e8ae8be7f62c783e1fb69ad029391dae3cc1ecf34014aa4f2a29dc6c436c6073"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sarge \
python3.10dist(sarge) \
python310-sarge \
python3dist(sarge)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
