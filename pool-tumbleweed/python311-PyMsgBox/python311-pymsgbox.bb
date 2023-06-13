SUMMARY = "A Python module for JavaScript-like message boxes"
DESCRIPTION = "A pure Python module for JavaScript-like message boxes."
LICENSE = "BSD-3-Clause"

PV = "1.0.9"

RPM_NAME = "python311-PyMsgBox-1.0.9-1.3.noarch.rpm"
RPM_HASH = "c9eaca7e7fec4af9a46d3d99d4352533d9eb4cb9acc75df301c2131be9d9d70693445928368a5d3252edf0e5b639dea096016492244414c35ba1e67eaefd7173"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pymsgbox) \
python311-PyMsgBox \
python3dist(pymsgbox)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
