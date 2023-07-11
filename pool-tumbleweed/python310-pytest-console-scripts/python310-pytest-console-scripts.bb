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

RPM_NAME = "python310-pytest-console-scripts-1.4.1-1.2.noarch.rpm"
RPM_HASH = "5be57114466fe5661654850b90fd5d2e76f06fbb118a57235583c48b0e5798fabba3c6b556f5b6d56681dbae5fbf54c3eef4d45ba544a95063426e6df8a249fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-console-scripts \
python310-pytest-console-scripts \
python3dist-pytest-console-scripts"

RDEPENDS:${PN} += "python-abi \
python310-pytest"

inherit rpm
