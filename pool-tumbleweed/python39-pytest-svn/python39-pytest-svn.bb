SUMMARY = "SVN repository fixture for pytest"
DESCRIPTION = "SVN repository fixture for py.test."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python39-pytest-svn-1.7.0-1.15.noarch.rpm"
RPM_HASH = "54c34b0d798507de0149e6368d6fc81a252ce6a8b5b017fba675d4a4bb3adfdb05e5d2ba94ccea973d415ff0a7590260d27e009e15ed7bc09744721a937adeed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-svn) \
python39-pytest-svn \
python3dist(pytest-svn)"

RDEPENDS:${PN} += "python(abi) \
python39-pytest \
python39-pytest-shutil \
subversion"

inherit rpm
