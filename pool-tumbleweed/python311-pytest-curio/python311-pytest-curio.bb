SUMMARY = "Pytest support for curio"
DESCRIPTION = "Pytest support for curio."
LICENSE = "Apache-2.0"

PV = "1.0.1"

RPM_NAME = "python311-pytest-curio-1.0.1-2.1.noarch.rpm"
RPM_HASH = "c09c4163e42e45b1a8d04199144b62260aaf47b7314779a3c3a9339d6d3b878cb1826293ba9cad15d2ff5b49f669d3c856ee171f103e5a3219aee21a20627707"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-curio \
python3.11dist-pytest-curio \
python311-pytest-curio \
python3dist-pytest-curio"

RDEPENDS:${PN} += "python-abi \
python311-curio \
python311-pytest"

inherit rpm
