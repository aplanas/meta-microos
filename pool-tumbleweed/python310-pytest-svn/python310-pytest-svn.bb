SUMMARY = "SVN repository fixture for pytest"
DESCRIPTION = "SVN repository fixture for py.test."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python310-pytest-svn-1.7.0-1.15.noarch.rpm"
RPM_HASH = "efbbed4c724acd1c138945b751f16bd7e8c18956717db9e51abac9ba652508d0812446ab51fdbe297d5e9c30e00aef0892032c2e12f75bd5e7f921371cf2f76d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-svn \
python3.10dist-pytest-svn \
python310-pytest-svn \
python3dist-pytest-svn"

RDEPENDS:${PN} += "python-abi \
python310-pytest \
python310-pytest-shutil \
subversion"

inherit rpm
