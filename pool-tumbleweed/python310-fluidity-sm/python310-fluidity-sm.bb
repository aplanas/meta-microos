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

RPM_NAME = "python310-fluidity-sm-0.2.0-2.2.noarch.rpm"
RPM_HASH = "a526bff0c0df524e23f438bd35b82578d98ede990f497f3bf4194c875d1863b605a2bffd45646686d0db3c2aefa65dfc9fb98d03a675ddaa3832e4657ac4a0c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-fluidity-sm \
python310-fluidity-sm \
python3dist-fluidity-sm"

RDEPENDS:${PN} += "python-abi"

inherit rpm
