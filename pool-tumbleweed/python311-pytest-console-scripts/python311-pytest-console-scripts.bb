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

RPM_NAME = "python311-pytest-console-scripts-1.4.1-1.2.noarch.rpm"
RPM_HASH = "5e45a556c9b346915183b93c1412d5cd1fad1b99e5bba68f2772daf005697cf5892cee57fe792bd777f0146929b13aa3146e700a1780bc670ea502414a8c5dee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-console-scripts \
python3.11dist-pytest-console-scripts \
python311-pytest-console-scripts \
python3dist-pytest-console-scripts"

RDEPENDS:${PN} += "python-abi \
python311-pytest"

inherit rpm
