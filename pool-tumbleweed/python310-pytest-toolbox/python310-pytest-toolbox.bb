SUMMARY = "Numerous plugins for pytest"
DESCRIPTION = "Numerous useful plugins for pytest."
LICENSE = "MIT"

PV = "0.4"

RPM_NAME = "python310-pytest-toolbox-0.4-3.3.noarch.rpm"
RPM_HASH = "0db486871569c7da3df0a138d9f7c6f7aae3c39e33ea7a0e46afc1ea402096ca126fd70c1aa0994f2493a5ad0fa3eb5663ddb9f9155bb29847283ec84dc24121"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-toolbox \
python3.10dist(pytest-toolbox) \
python310-pytest-toolbox \
python3dist(pytest-toolbox)"
RDEPENDS:${PN} += "python(abi) \
python310-py \
python310-pytest"

inherit rpm
