SUMMARY = "Fixtures in freeze_time"
DESCRIPTION = "Wrap tests with fixtures in freeze_time"
LICENSE = "MIT"

PV = "0.4.2"

RPM_NAME = "python310-pytest-freezegun-0.4.2-3.1.noarch.rpm"
RPM_HASH = "478ad99f0a9b6c479df49eb044a43167d15d8e48970961606a2443469c1f90dbbb98b70d794e3e5d7affd13d11845ea79a067852ba1968f7d15a7fe135c32302"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-freezegun \
python3.10dist(pytest-freezegun) \
python310-pytest-freezegun \
python3dist(pytest-freezegun)"
RDEPENDS:${PN} += "python(abi) \
python310-freezegun \
python310-pytest"

inherit rpm
