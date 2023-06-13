SUMMARY = "Python patcher system"
DESCRIPTION = "Python patcher system to allow easy and lasting API compatibility."
LICENSE = "MIT"

PV = "2.1"

RPM_NAME = "python310-compat-patcher-core-2.1-1.3.noarch.rpm"
RPM_HASH = "e485e573d28bc5a02f91d41afb3a7a263e4023d84640097aeb726dd0d50aba861659c5255340703db268079299469d4f5dbd64fc126c54d18e5a67bf3032eb85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-compat-patcher-core \
python3.10dist(compat-patcher-core) \
python310-compat-patcher-core \
python3dist(compat-patcher-core)"

RDEPENDS:${PN} += "python(abi) \
python310-six"

inherit rpm
