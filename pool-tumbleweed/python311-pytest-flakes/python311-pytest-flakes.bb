SUMMARY = "Pytest plugin to check source code with pyflakes"
DESCRIPTION = "py.test plugin for efficiently checking python source with pyflakes."
LICENSE = "MIT"

PV = "4.0.5"

RPM_NAME = "python311-pytest-flakes-4.0.5-1.8.noarch.rpm"
RPM_HASH = "bd85ae96809e482295a55ccdd795894e05b6ed503300879877ab5ee0fe750bbf474b5926c7cf63cdf2ce47f61d6a5c63f642179e5fe5a85d17dd5c2a3d81b3f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-flakes \
python3.11dist-pytest-flakes \
python311-pytest-flakes \
python3dist-pytest-flakes"

RDEPENDS:${PN} += "python-abi \
python311-pyflakes \
python311-pytest"

inherit rpm
