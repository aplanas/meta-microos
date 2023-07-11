SUMMARY = "Pytest support for curio"
DESCRIPTION = "Pytest support for curio."
LICENSE = "Apache-2.0"

PV = "1.0.1"

RPM_NAME = "python310-pytest-curio-1.0.1-1.10.noarch.rpm"
RPM_HASH = "c7f361914255b2158a2c583580794335992299c016ba3ab3ebd4742203536ff925ff1c6a01d4f179632484fd8e6b63116d1e254d934b8eb71085520a81fd4f93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-curio \
python310-pytest-curio \
python3dist-pytest-curio"

RDEPENDS:${PN} += "python-abi \
python310-curio \
python310-pytest"

inherit rpm
