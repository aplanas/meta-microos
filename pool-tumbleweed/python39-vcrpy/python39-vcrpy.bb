SUMMARY = "Python module to mock and replay HTTP interactions"
DESCRIPTION = "This module records a test suite's HTTP interactions and replays them during future \
test runs for deterministic tests. \
 \
This is a Python version of Ruby's VCR library."
LICENSE = "MIT"

PV = "4.2.1"

RPM_NAME = "python39-vcrpy-4.2.1-2.1.noarch.rpm"
RPM_HASH = "7932b864d00cf1ebe5070505545d0870a3fac4ceebbd4564342c41e2893efedfb484e3196998a89a322cceb3c83fed6e138d960389d38392ea42e11fa91c6f86"
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
