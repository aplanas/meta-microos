SUMMARY = "SVN repository fixture for pytest"
DESCRIPTION = "SVN repository fixture for py.test."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python310-pytest-svn-1.7.0-1.17.noarch.rpm"
RPM_HASH = "f68abfe1a9b8a5d45f427f4d99369de57fad81c10ad513b52766e52f1e6045eb37265aa68a7d2f0dae45d62161604c9d816d2e5eb77e635b08ba5e4549f37ef1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-svn \
python310-pytest-svn \
python3dist-pytest-svn"

RDEPENDS:${PN} += "python-abi \
python310-pytest \
python310-pytest-shutil \
subversion"

inherit rpm
