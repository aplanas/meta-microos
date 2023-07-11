SUMMARY = "SVN repository fixture for pytest"
DESCRIPTION = "SVN repository fixture for py.test."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python311-pytest-svn-1.7.0-1.17.noarch.rpm"
RPM_HASH = "5945133dbc19f2fa82cc4a9063c2235a47ca8dcdda23d3537f09abca015d5b3a2db8c21fe21e1a7c13f70fbb655fae879112ed5015d4e8c2d243e7093c929562"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-svn \
python3.11dist-pytest-svn \
python311-pytest-svn \
python3dist-pytest-svn"

RDEPENDS:${PN} += "python-abi \
python311-pytest \
python311-pytest-shutil \
subversion"

inherit rpm
