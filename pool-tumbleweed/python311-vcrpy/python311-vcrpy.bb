SUMMARY = "Python module to mock and replay HTTP interactions"
DESCRIPTION = "This module records a test suite's HTTP interactions and replays them during future \
test runs for deterministic tests. \
 \
This is a Python version of Ruby's VCR library."
LICENSE = "MIT"

PV = "4.2.1"

RPM_NAME = "python311-vcrpy-4.2.1-3.1.noarch.rpm"
RPM_HASH = "3070724be4459e45309404fee187ae29e4b261da4ef57207822fdb526008e2e99a040e58644aec61b4410d498d128a920742306e2c6987b535592041733246a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-vcrpy \
python3.11dist-vcrpy \
python311-vcrpy \
python3dist-vcrpy"

RDEPENDS:${PN} += "python-abi \
python311-PyYAML \
python311-six \
python311-urllib3 \
python311-wrapt \
python311-yarl"

inherit rpm
