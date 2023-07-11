SUMMARY = "Pytest support for curio"
DESCRIPTION = "Pytest support for curio."
LICENSE = "Apache-2.0"

PV = "1.0.1"

RPM_NAME = "python39-pytest-curio-1.0.1-1.10.noarch.rpm"
RPM_HASH = "e402469868345950eb4cfcb2d3c4264077a4a91449e9d90aa918c4cda3e232b1fd504aa178a2b443155c3df5dc14937a86839e07e5d7ce04a839a702faf3af14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-curio \
python39-pytest-curio \
python3dist-pytest-curio"

RDEPENDS:${PN} += "python-abi \
python39-curio \
python39-pytest"

inherit rpm
