SUMMARY = "Function for capturing the outcome of Python function calls"
DESCRIPTION = "Outcome provides a function for capturing the outcome of a Python \
function call, so that it can be passed around."
LICENSE = "Apache-2.0 | MIT"

PV = "1.2.0"

RPM_NAME = "python310-outcome-1.2.0-4.1.noarch.rpm"
RPM_HASH = "952deb5036f4b4206f6e467d3c8fe00c31c83aadc5be6c5d3933c458068a2f71fcb84064bc093a54bed2453da5da5dc43aa3075e96a5694432f3d96e903554a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-outcome \
python310-outcome \
python3dist-outcome"

RDEPENDS:${PN} += "python-abi \
python310-attrs"

inherit rpm
