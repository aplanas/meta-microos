SUMMARY = "A minimalist production ready plugin system"
DESCRIPTION = "This is the core framework used by the pytest, tox, and devpi projects."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-pluggy-1.0.0-2.3.noarch.rpm"
RPM_HASH = "e3d2dcac60dda82a5e91d27f76981d6a735fc8cb86cf450c958ba64781562db986617d9faa3a95a620edcd3a4ea7ab2d5d41922d7096031dce39b086e51cbcd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pluggy \
python310-pluggy \
python3dist-pluggy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
