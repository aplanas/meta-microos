SUMMARY = "SVN repository fixture for pytest"
DESCRIPTION = "SVN repository fixture for py.test."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python39-pytest-svn-1.7.0-1.17.noarch.rpm"
RPM_HASH = "db82955799561e86721e5ed64cc652db989f891d95f836b8eeb801e343492f010e8ae4d7aad3c22f2df20f9f9b25904e91f7ad211da7b404c1c7c69d6dd087ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-svn \
python39-pytest-svn \
python3dist-pytest-svn"

RDEPENDS:${PN} += "python-abi \
python39-pytest \
python39-pytest-shutil \
subversion"

inherit rpm
