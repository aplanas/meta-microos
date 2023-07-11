SUMMARY = "Pytest plugin to check source code with pyflakes"
DESCRIPTION = "py.test plugin for efficiently checking python source with pyflakes."
LICENSE = "MIT"

PV = "4.0.5"

RPM_NAME = "python310-pytest-flakes-4.0.5-1.8.noarch.rpm"
RPM_HASH = "cb129cda557527d954e91fc987f35eca8e2d7cb9e0720009bb01ebb379036b2845486cdd1f188a351d751e2b503c2ac06d16b35729c93e5768ae4f4db76bb3d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-flakes \
python310-pytest-flakes \
python3dist-pytest-flakes"

RDEPENDS:${PN} += "python-abi \
python310-pyflakes \
python310-pytest"

inherit rpm
