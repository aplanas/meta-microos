SUMMARY = "Pure Python PartiQL Parser"
DESCRIPTION = "Pure Python PartiQL Parser"
LICENSE = "MIT"

PV = "0.3.4"

RPM_NAME = "python311-py-partiql-parser-0.3.4-1.1.noarch.rpm"
RPM_HASH = "7530afbddbe5a97870059f831bee30b88b114b31b868e883d3d0be737af10e2470ba2a855311b61011a8673c797be1cde149ad8f571ea9ae2426fd808ae9e39c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-py-partiql-parser \
python3.11dist-py-partiql-parser \
python311-py-partiql-parser \
python3dist-py-partiql-parser"

RDEPENDS:${PN} += "python-abi"

inherit rpm
