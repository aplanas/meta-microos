SUMMARY = "Javascript parser based on esprimajs"
DESCRIPTION = "A JavaScript parser - a manual translation of esprima.js to Python. \
It supports the whole of ECMAScript 5.1 and parts of ECMAScript 6."
LICENSE = "MIT"

PV = "2.7.1"

RPM_NAME = "python310-pyjsparser-2.7.1-2.2.noarch.rpm"
RPM_HASH = "2ff326a1b7ce64c8fcbec2fe882d97546ba89c124e289d828d3a2e6b91265e1b94fc74757edf03d02ca8dd18fb03051c2cffb49005579ff098065f41d393e5ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyjsparser \
python310-pyjsparser \
python3dist-pyjsparser"

RDEPENDS:${PN} += "python-abi"

inherit rpm
