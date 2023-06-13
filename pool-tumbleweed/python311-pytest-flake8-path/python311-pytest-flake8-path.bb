SUMMARY = "A pytest fixture for testing flake8 plugins"
DESCRIPTION = "A pytest fixture for testing flake8 plugins."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python311-pytest-flake8-path-1.3.0-1.2.noarch.rpm"
RPM_HASH = "c05a697f06ba03c533c652e9a5740fbe5838c61eb757e4e9c1a541c960db457dba6cdbc11ecb7cd0a9b3d717d60f3239cb388e4c52011557748471bd1a0608df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-flake8-path) \
python311-pytest-flake8-path \
python3dist(pytest-flake8-path)"

RDEPENDS:${PN} += "python(abi) \
python311-flake8 \
python311-pytest"

inherit rpm
