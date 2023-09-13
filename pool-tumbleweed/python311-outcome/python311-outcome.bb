SUMMARY = "Function for capturing the outcome of Python function calls"
DESCRIPTION = "Outcome provides a function for capturing the outcome of a Python \
function call, so that it can be passed around."
LICENSE = "Apache-2.0 | MIT"

PV = "1.2.0"

RPM_NAME = "python311-outcome-1.2.0-4.1.noarch.rpm"
RPM_HASH = "44b850abae4af840674c2457f6ed114ea09e2ce0dd9aaa07e9d067ed59683b39ea6ec20ebf3931705305b5dec0c7fe80fb8bf6c5ef00f85402476270a3ccc262"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-outcome \
python3.11dist-outcome \
python311-outcome \
python3dist-outcome"

RDEPENDS:${PN} += "python-abi \
python311-attrs"

inherit rpm
