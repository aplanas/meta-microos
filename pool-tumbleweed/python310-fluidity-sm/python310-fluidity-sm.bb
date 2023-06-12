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

RPM_NAME = "python310-fluidity-sm-0.2.0-2.1.noarch.rpm"
RPM_HASH = "98122153b9aeaa026783975012ade2ac1192b3146c13c1252859c52a22ada4eeae1ea5dc47c1222002641653756fd15ab93d25af7ce0f5a07c53910823f76538"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fluidity-sm \
python3.10dist(fluidity-sm) \
python310-fluidity-sm \
python3dist(fluidity-sm)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
