SUMMARY = "Plugin for managing VCR.py cassettes"
DESCRIPTION = "Plugin for managing VCR.py cassettes."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python310-pytest-vcr-1.0.2-1.14.noarch.rpm"
RPM_HASH = "3f14c2c19f8506aa1c90d5a54fda968244bd655c075c4468296858b8eda4140a1827bbf43572032fc666c0a6120df63a06ce476f6a27799708ba9ebeb17e164a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-vcr \
python3.10dist(pytest-vcr) \
python310-pytest-vcr \
python3dist(pytest-vcr)"

RDEPENDS:${PN} += "python(abi) \
python310-pytest \
python310-vcrpy"

inherit rpm
