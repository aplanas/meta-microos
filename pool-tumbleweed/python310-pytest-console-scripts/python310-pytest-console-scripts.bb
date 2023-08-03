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

RPM_NAME = "python310-pytest-console-scripts-1.4.1-2.1.noarch.rpm"
RPM_HASH = "604fea183904068e27435c764e50ec5c257640b515fcf443ab26d1c7f0c7aef700107c21762022e7546270d0b3754cc342fc87c2f6b54197ceb8878a3cb06e6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-console-scripts \
python310-pytest-console-scripts \
python3dist-pytest-console-scripts"

RDEPENDS:${PN} += "python-abi \
python310-pytest"

inherit rpm
