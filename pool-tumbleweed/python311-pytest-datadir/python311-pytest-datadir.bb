SUMMARY = "Plugin for test data directories and files"
DESCRIPTION = "pytest plugin for test data directories and files."
LICENSE = "MIT"

PV = "1.4.1"

RPM_NAME = "python311-pytest-datadir-1.4.1-1.1.noarch.rpm"
RPM_HASH = "82e025d7199b779ec0c7936f8269b28bbf87cfcbb30dce354927102436b8f80a7fb2e4f7bbde0a6b15aa2820e79d44ebc7dd1e3f6b5c486a4cee0addedabc35b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pytest-datadir \
python311-pytest-datadir \
python3dist-pytest-datadir"

RDEPENDS:${PN} += "python-abi \
python311-pytest"

inherit rpm
