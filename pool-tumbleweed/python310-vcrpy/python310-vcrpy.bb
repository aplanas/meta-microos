SUMMARY = "Python module to mock and replay HTTP interactions"
DESCRIPTION = "This module records a test suite's HTTP interactions and replays them during future \
test runs for deterministic tests. \
 \
This is a Python version of Ruby's VCR library."
LICENSE = "MIT"

PV = "4.2.1"

RPM_NAME = "python310-vcrpy-4.2.1-3.1.noarch.rpm"
RPM_HASH = "a18cbdee4fe83721ce6c55b60493894d239123b6c6f5d76ff0e5a3041b3e53cc957cbdde8723a5f8ba52499cd720fcad280c3c796eac6ac35d86bd74bb3f6fc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-vcrpy \
python310-vcrpy \
python3dist-vcrpy"

RDEPENDS:${PN} += "python-abi \
python310-PyYAML \
python310-six \
python310-urllib3 \
python310-wrapt \
python310-yarl"

inherit rpm
