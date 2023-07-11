SUMMARY = "Function for capturing the outcome of Python function calls"
DESCRIPTION = "Outcome provides a function for capturing the outcome of a Python \
function call, so that it can be passed around."
LICENSE = "Apache-2.0 | MIT"

PV = "1.2.0"

RPM_NAME = "python39-outcome-1.2.0-3.3.noarch.rpm"
RPM_HASH = "2dbedf750de40f735d2d62916764434821337d6411d32f3155bcdad2686a70abdc00be0aa771af29f6b6735ee71b7c71ac0cb6cdc83c660c489ee8eebb1d8595"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-outcome \
python39-outcome \
python3dist-outcome"

RDEPENDS:${PN} += "python-abi \
python39-attrs"

inherit rpm
