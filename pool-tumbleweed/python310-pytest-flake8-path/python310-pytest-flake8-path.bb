SUMMARY = "A pytest fixture for testing flake8 plugins"
DESCRIPTION = "A pytest fixture for testing flake8 plugins."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python310-pytest-flake8-path-1.3.0-1.2.noarch.rpm"
RPM_HASH = "73500123e0b8d22874b4a3653b2034e564f65ee4377193091740938d1fa214ec143fe48be43fb1271e8bf7bf3c47b3dd072b183dd108b6c0014941002da37aa5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-flake8-path \
python3.10dist(pytest-flake8-path) \
python310-pytest-flake8-path \
python3dist(pytest-flake8-path)"

RDEPENDS:${PN} += "python(abi) \
python310-flake8 \
python310-pytest"

inherit rpm
