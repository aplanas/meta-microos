SUMMARY = "Pytest support for curio"
DESCRIPTION = "Pytest support for curio."
LICENSE = "Apache-2.0"

PV = "1.0.1"

RPM_NAME = "python311-pytest-curio-1.0.1-1.10.noarch.rpm"
RPM_HASH = "24bad0f87d1363a6b93ea8b67982014356f492f06f1df5faace5cf8bc5fd2e525eab39b3f90769e53b93f06e3d8662706e8204bdf9465c0022d844d77f385238"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-curio \
python3.11dist-pytest-curio \
python311-pytest-curio \
python3dist-pytest-curio"

RDEPENDS:${PN} += "python-abi \
python311-curio \
python311-pytest"

inherit rpm
