SUMMARY = "A port of node.js's EventEmitter to python"
DESCRIPTION = "pyee supplies an ``EventEmitter`` object similar to the ``EventEmitter`` \
from Node.js."
LICENSE = "MIT"

PV = "9.0.4"

RPM_NAME = "python39-pyee-9.0.4-1.5.noarch.rpm"
RPM_HASH = "326892e18b1fc0af75cf79a0ee3933287fdf5bdc9faa16d99c0ac0d25e9c7a1f7d5c0408d4b4ba8bef05041b34217c678e0af66c541cfce29fe8e0ed0615f659"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyee \
python39-pyee \
python3dist-pyee"

RDEPENDS:${PN} += "python-abi"

inherit rpm
