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

RPM_NAME = "python39-fluidity-sm-0.2.0-2.1.noarch.rpm"
RPM_HASH = "f0cb75db58bf776ebf83c585a16acb2f9da85c8bb5d329bb34b5f6a74f20aa777bbc44e7831347d660e1944ebd1526f184ef373b6abdf051e7feba42ad77947a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-fluidity-sm \
python39-fluidity-sm \
python3dist-fluidity-sm"

RDEPENDS:${PN} += "python-abi"

inherit rpm
