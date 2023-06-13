SUMMARY = "Pytest plugin to check source code with pyflakes"
DESCRIPTION = "py.test plugin for efficiently checking python source with pyflakes."
LICENSE = "MIT"

PV = "4.0.5"

RPM_NAME = "python310-pytest-flakes-4.0.5-1.6.noarch.rpm"
RPM_HASH = "4a26e1f9aea23983346ac988be11a338fdc1d3ca6cfd617d458387c58647e04ae51cd0b9e1ce87430da34f518cc216d1783ee0a747af619ca1c6722faed50532"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-flakes \
python3.10dist(pytest-flakes) \
python310-pytest-flakes \
python3dist(pytest-flakes)"

RDEPENDS:${PN} += "python(abi) \
python310-pyflakes \
python310-pytest"

inherit rpm
