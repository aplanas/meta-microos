SUMMARY = "Pytest support for curio"
DESCRIPTION = "Pytest support for curio."
LICENSE = "Apache-2.0"

PV = "1.0.1"

RPM_NAME = "python310-pytest-curio-1.0.1-2.1.noarch.rpm"
RPM_HASH = "854372464963d00ea9bc49af090719e10590a69f35c759bea61329e71c5eb04579e05452f0162f761253f0d5c26cf6dd43fd39f93414b9ccceb7835bc831bef3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-curio \
python310-pytest-curio \
python3dist-pytest-curio"

RDEPENDS:${PN} += "python-abi \
python310-curio \
python310-pytest"

inherit rpm
