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

RPM_NAME = "python39-pytest-console-scripts-1.4.1-2.1.noarch.rpm"
RPM_HASH = "d23a226d1efcbadaa5651f034d51f1c132015b8b0cc5b066d160e9235c92eed24575d422abae95ce586f9672e4ed3df36fc7143325ef2c856b95953a68d26675"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-console-scripts \
python39-pytest-console-scripts \
python3dist-pytest-console-scripts"

RDEPENDS:${PN} += "python-abi \
python39-pytest"

inherit rpm
