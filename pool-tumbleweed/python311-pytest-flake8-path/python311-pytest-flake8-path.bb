SUMMARY = "A pytest fixture for testing flake8 plugins"
DESCRIPTION = "A pytest fixture for testing flake8 plugins."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "python311-pytest-flake8-path-1.5.0-1.1.noarch.rpm"
RPM_HASH = "bc6617b25174df16b7cc3ea09399baece279522422729f4ceba48ca6c9f220efbf28527d1581067950e79f956047ce16d74cea1c47fb5d49f7e1880216e3f023"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-flake8-path \
python3.11dist-pytest-flake8-path \
python311-pytest-flake8-path \
python3dist-pytest-flake8-path"

RDEPENDS:${PN} += "python-abi \
python311-flake8 \
python311-pytest"

inherit rpm
