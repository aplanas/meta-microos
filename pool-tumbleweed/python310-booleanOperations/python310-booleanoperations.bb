SUMMARY = "Boolean operations on paths"
DESCRIPTION = "Boolean operations on paths."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python310-booleanOperations-0.9.0-2.7.noarch.rpm"
RPM_HASH = "324a4a36426d02b655c2af7ff5138131b29dcae6e4b62395c54e9b0c146c41108d54ae820359882a5773e2f2bd752a5e5eb715e68a65da2d0cf7aedda74115b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-booleanOperations \
python3.10dist(booleanoperations) \
python310-booleanOperations \
python3dist(booleanoperations)"

RDEPENDS:${PN} += "python(abi) \
python310-FontTools \
python310-pyclipper"

inherit rpm
