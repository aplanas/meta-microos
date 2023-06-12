SUMMARY = "Pytest plugin to run pycodestyle"
DESCRIPTION = "pytest plugin to run pycodestyle in python tests"
LICENSE = "MIT"

PV = "2.3.1"

RPM_NAME = "python311-pytest-pycodestyle-2.3.1-1.3.noarch.rpm"
RPM_HASH = "afca355f2d29a50fb7c6bed1e0796a9237d346e9aba57add023dd1d392d54908273280b6241dca31b2fcd79b9e545930e08e559307dee9918c52de9724baa852"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-pycodestyle) \
python311-pytest-codestyle \
python311-pytest-pycodestyle \
python3dist(pytest-pycodestyle)"
RDEPENDS:${PN} += "python(abi) \
python311-py \
python311-pycodestyle \
python311-pytest \
python311-setuptools"

inherit rpm
