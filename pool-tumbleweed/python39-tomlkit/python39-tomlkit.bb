SUMMARY = "Style preserving TOML library"
DESCRIPTION = "Style preserving TOML library"
LICENSE = "MIT"

PV = "0.12.1"

RPM_NAME = "python39-tomlkit-0.12.1-1.1.noarch.rpm"
RPM_HASH = "af802270b793ead3ad77b7487919e802d78854855df9ecb07af4dbf9543448fa4afd7ff90d081f907e493424a577f365d9d915b9de3bf78b16c9c2c72ff995a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-tomlkit \
python39-tomlkit \
python3dist-tomlkit"

RDEPENDS:${PN} += "python-abi"

inherit rpm
