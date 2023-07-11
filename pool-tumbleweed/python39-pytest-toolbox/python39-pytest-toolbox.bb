SUMMARY = "Numerous plugins for pytest"
DESCRIPTION = "Numerous useful plugins for pytest."
LICENSE = "MIT"

PV = "0.4"

RPM_NAME = "python39-pytest-toolbox-0.4-3.5.noarch.rpm"
RPM_HASH = "0e318a7734ea9385d3f45e2a210c0485e78cc43cac25f66459d4fbafbedaa4da02524fbd7acb0d57674f03ff321b55b7bb0a9c83ca58aa6ef537d26b755b1785"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-toolbox \
python39-pytest-toolbox \
python3dist-pytest-toolbox"

RDEPENDS:${PN} += "python-abi \
python39-py \
python39-pytest"

inherit rpm
