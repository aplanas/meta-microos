SUMMARY = "Pytest plugin for testing console scripts"
DESCRIPTION = "Pytest-console-scripts is a `Pytest`_ plugin for testing python scripts \
installed via ``console_scripts`` entry point of ``setup.py``. It can run the \
scripts under test in a separate process or using the interpreter that's \
running the test suite.  The former mode ensures that the script will run in an \
environment that is identical to normal execution whereas the latter one allows \
much quicker test runs during development while simulating the real runs as \
much as possible."
LICENSE = "MIT"

PV = "1.4.1"

RPM_NAME = "python39-pytest-console-scripts-1.4.1-1.1.noarch.rpm"
RPM_HASH = "ea9af961c8449d8e05660fbd10d7d9b102b6df50754ec2e1cade6862344687f06c2f6ee743b40850432c8235311cfc155a997f39c866369a6bd5d28c6311adbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-console-scripts) \
python39-pytest-console-scripts \
python3dist(pytest-console-scripts)"
RDEPENDS:${PN} += "python(abi) \
python39-pytest"

inherit rpm
