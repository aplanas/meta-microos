SUMMARY = "Command aliases for Click"
DESCRIPTION = "Command aliases for Click."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python39-click-aliases-1.0.1-3.12.noarch.rpm"
RPM_HASH = "b422eae0306a0cbb20695bddcee04786b0fa0f391e7fc0393d59922726b6e6a56474bc68547c00c82515aac32054634a31f2d83614be6be3d4aad3a0e1a7323c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(click-aliases) \
python39-click-aliases \
python3dist(click-aliases)"
RDEPENDS:${PN} += "python(abi) \
python39-click"

inherit rpm
