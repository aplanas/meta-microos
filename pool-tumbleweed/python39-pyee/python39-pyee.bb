SUMMARY = "A port of node.js's EventEmitter to python"
DESCRIPTION = "pyee supplies an ``EventEmitter`` object similar to the ``EventEmitter`` \
from Node.js."
LICENSE = "MIT"

PV = "9.0.4"

RPM_NAME = "python39-pyee-9.0.4-1.3.noarch.rpm"
RPM_HASH = "20e3de3ac131107a0352e40aa5f5b7a9616f6cfd3eb66783064f94e03c27c725408ee3ff6ec02e5141d4b7905204e30d08e250ff9ae0f29693617e5f9d8c0828"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyee \
python39-pyee \
python3dist-pyee"

RDEPENDS:${PN} += "python-abi"

inherit rpm
