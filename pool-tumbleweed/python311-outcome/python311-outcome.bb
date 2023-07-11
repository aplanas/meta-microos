SUMMARY = "Function for capturing the outcome of Python function calls"
DESCRIPTION = "Outcome provides a function for capturing the outcome of a Python \
function call, so that it can be passed around."
LICENSE = "Apache-2.0 | MIT"

PV = "1.2.0"

RPM_NAME = "python311-outcome-1.2.0-3.3.noarch.rpm"
RPM_HASH = "0e324948408938ba2497fdd7be278ce2f38b44ff3057eaf66b8290d15176f1c2c15ac5c68bb6fc51d29eae04218260e1aba1e570cbbb0ed58b0b66e07b425d91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-outcome \
python3.11dist-outcome \
python311-outcome \
python3dist-outcome"

RDEPENDS:${PN} += "python-abi \
python311-attrs"

inherit rpm
