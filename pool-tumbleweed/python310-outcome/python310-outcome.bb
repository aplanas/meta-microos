SUMMARY = "Function for capturing the outcome of Python function calls"
DESCRIPTION = "Outcome provides a function for capturing the outcome of a Python \
function call, so that it can be passed around."
LICENSE = "Apache-2.0 | MIT"

PV = "1.2.0"

RPM_NAME = "python310-outcome-1.2.0-3.3.noarch.rpm"
RPM_HASH = "511b6734b2a765f428021556f82bb275215fdee315e9743a1ace28e041860501c530bf0452339663418db790d50e633503812c4bba107ea644368695a8d55581"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-outcome \
python310-outcome \
python3dist-outcome"

RDEPENDS:${PN} += "python-abi \
python310-attrs"

inherit rpm
