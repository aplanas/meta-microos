SUMMARY = "JSON Referencing + Python"
DESCRIPTION = "JSON Referencing + Python"
LICENSE = "MIT"

PV = "0.29.0"

RPM_NAME = "python311-referencing-0.29.0-1.1.noarch.rpm"
RPM_HASH = "da6ed3727da5ab84255c86d2d3fb8e4ef5c8a999c183afa71e2b5dae6a4c495a6881a1fb11b4431baebe72f73207ebe484e163d07ecf1f9942f6fe7816f052ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-referencing \
python311-referencing \
python3dist-referencing"

RDEPENDS:${PN} += "python-abi \
python311-attrs \
python311-rpds-py"

inherit rpm
