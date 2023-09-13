SUMMARY = "Function for capturing the outcome of Python function calls"
DESCRIPTION = "Outcome provides a function for capturing the outcome of a Python \
function call, so that it can be passed around."
LICENSE = "Apache-2.0 | MIT"

PV = "1.2.0"

RPM_NAME = "python39-outcome-1.2.0-4.1.noarch.rpm"
RPM_HASH = "54e697918a896010dbe6830e0238ddc0724d81ae135d682528acf9f28fcbafdf8eb50e97924128091c0c7c27bb9447af225620d37d6792bf1c7da9e3b6afe00c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-outcome \
python39-outcome \
python3dist-outcome"

RDEPENDS:${PN} += "python-abi \
python39-attrs"

inherit rpm
