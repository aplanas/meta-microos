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

RPM_NAME = "python311-pytest-console-scripts-1.4.1-2.1.noarch.rpm"
RPM_HASH = "06df862bae49f0584efc2cfc5c49ee69d6cad412d1ad9167dc764a4d8c1cd21dc56998700f0ec6504ae99664b451cf96ab2687dcebca1b8cb4c16b52526cc39f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-console-scripts \
python3.11dist-pytest-console-scripts \
python311-pytest-console-scripts \
python3dist-pytest-console-scripts"

RDEPENDS:${PN} += "python-abi \
python311-pytest"

inherit rpm
