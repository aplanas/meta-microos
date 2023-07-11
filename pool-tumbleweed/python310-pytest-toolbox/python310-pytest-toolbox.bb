SUMMARY = "Numerous plugins for pytest"
DESCRIPTION = "Numerous useful plugins for pytest."
LICENSE = "MIT"

PV = "0.4"

RPM_NAME = "python310-pytest-toolbox-0.4-3.5.noarch.rpm"
RPM_HASH = "eefcc6c01a01407f4d0434ea12d79d416b4cc75b20b308551f89184978f61a1810fe5497a693467bf50f1008471dd7dec2c4c896b9afe6b1a5b04b37c14f84c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-toolbox \
python310-pytest-toolbox \
python3dist-pytest-toolbox"

RDEPENDS:${PN} += "python-abi \
python310-py \
python310-pytest"

inherit rpm
