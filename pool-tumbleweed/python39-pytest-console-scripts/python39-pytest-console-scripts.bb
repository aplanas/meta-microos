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

RPM_NAME = "python39-pytest-console-scripts-1.4.1-1.2.noarch.rpm"
RPM_HASH = "67a71e38fdcc4a2275e8013babf298bc0ba787bb0fe0d813431f93467f1efa5d3b6b90f2a00501f98013303ad1dc792a4f6fed31a6391ad3057f6fee95703216"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-console-scripts \
python39-pytest-console-scripts \
python3dist-pytest-console-scripts"

RDEPENDS:${PN} += "python-abi \
python39-pytest"

inherit rpm
