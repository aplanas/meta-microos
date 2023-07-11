SUMMARY = "Python module to mock and replay HTTP interactions"
DESCRIPTION = "This module records a test suite's HTTP interactions and replays them during future \
test runs for deterministic tests. \
 \
This is a Python version of Ruby's VCR library."
LICENSE = "MIT"

PV = "4.2.1"

RPM_NAME = "python39-vcrpy-4.2.1-3.1.noarch.rpm"
RPM_HASH = "f0fce8c96c25ad4eca7b7bd53da62b994613296c1140b7bae121d1b82f1598af803c790a077a15caf65c864f9604cb6d584dbb59d2ed2ef4d41275d329fac82b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-vcrpy \
python39-vcrpy \
python3dist-vcrpy"

RDEPENDS:${PN} += "python-abi \
python39-PyYAML \
python39-six \
python39-urllib3 \
python39-wrapt \
python39-yarl"

inherit rpm
