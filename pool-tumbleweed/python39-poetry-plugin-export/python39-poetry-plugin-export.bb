SUMMARY = "Poetry plugin to export the dependencies to various formats"
DESCRIPTION = "Poetry plugin to export the dependencies to various formats"
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python39-poetry-plugin-export-1.4.0-1.3.noarch.rpm"
RPM_HASH = "502a8c5fd5be8df151fc2f1f7a133d0cf2a7771d4d8c0614ecc5130d2d4263aac4704d9d60f9845da7521a0b5a5fa06de33c79d2beb854179ef43ccf1e066f7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-poetry-plugin-export \
python39-poetry-plugin-export \
python3dist-poetry-plugin-export"

RDEPENDS:${PN} += "python-abi \
python39-poetry \
python39-poetry-core"

inherit rpm
