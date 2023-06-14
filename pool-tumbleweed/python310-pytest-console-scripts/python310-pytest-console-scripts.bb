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

RPM_NAME = "python310-pytest-console-scripts-1.4.1-1.1.noarch.rpm"
RPM_HASH = "9eeb0351727d11bbdc0fe1f26de8e74c4601f10219d0c9e187bfe035ef46585d84ac7143c29c11bf8e9e4ccb8ed12a1b8014e5fdc33a1dcbaf9bbbbb3d9c37c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-console-scripts \
python3.10dist-pytest-console-scripts \
python310-pytest-console-scripts \
python3dist-pytest-console-scripts"

RDEPENDS:${PN} += "python-abi \
python310-pytest"

inherit rpm
