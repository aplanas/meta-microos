SUMMARY = "A port of node.js's EventEmitter to python"
DESCRIPTION = "pyee supplies an ``EventEmitter`` object similar to the ``EventEmitter`` \
from Node.js."
LICENSE = "MIT"

PV = "9.0.4"

RPM_NAME = "python310-pyee-9.0.4-1.5.noarch.rpm"
RPM_HASH = "f71967d56eb3c2aa935ca652e5fc1c1cafce95996f5505f4b09c3940cb838198d51dae2adbeefddbf3491e33e789914814c43d29c2cc2fda30507ad7f4271e2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyee \
python310-pyee \
python3dist-pyee"

RDEPENDS:${PN} += "python-abi"

inherit rpm
