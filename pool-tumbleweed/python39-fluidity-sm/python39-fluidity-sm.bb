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

RPM_NAME = "python39-fluidity-sm-0.2.0-2.2.noarch.rpm"
RPM_HASH = "e2c9753d0b3ebe98a0ad290432639b7fce79ac07897c263be85a8f9da78ffd0475d3bc44d8fe33d2f0484e118d854ed7610e233308525da9cae7461e00f830dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-fluidity-sm \
python39-fluidity-sm \
python3dist-fluidity-sm"

RDEPENDS:${PN} += "python-abi"

inherit rpm
