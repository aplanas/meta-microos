SUMMARY = "State machine implementation for Python objects"
DESCRIPTION = "State machine implementation for Python objects. \
 \
A Fluidity state machine must have one initial state and at least two states. \
 \
A state may have enter and exit callbacks, for running some code on state enter \
and exit, respectively. These params can be method names (as strings), \
callables, or lists of method names or callables."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python311-fluidity-sm-0.2.0-2.2.noarch.rpm"
RPM_HASH = "786cdbb16e53513893a1de0dfbf04beddfbd4d910136f8e688a70e62760ab8b04d0a5c4c1a075e1ee3d9b438cf0a618fde6c1a374325fec6955cc9f2fbe31220"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fluidity-sm \
python3.11dist-fluidity-sm \
python311-fluidity-sm \
python3dist-fluidity-sm"

RDEPENDS:${PN} += "python-abi"

inherit rpm
